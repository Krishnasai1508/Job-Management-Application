
// ********************************* pop-up page **********************************

function createjob() {
    document.getElementById("jobModal").style.display = "flex";
}

function closejob() {
document.getElementById("jobModal").style.display = "none";
}



// ****************************** sending to spring boot ***************************


function submitjob() {
    const jobname = document.getElementById('jobname').value;
    const companyname = document.getElementById('comname').value;
    const location = document.getElementById('location').value;
    const jobtype = document.getElementById('jobtype').value;
    const salary = document.getElementById('salary1').value;
    const description = document.getElementById('description').value;

    fetch('http://localhost:8080/api/jobs', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ jobtitle: jobname, companyname: companyname, location: location, jobtype: jobtype, salary: salary ,description: description })
    })
    .then(res => res.text())
    .then(msg => {
      alert(msg); // Show success message
      closeModal(); // Hide modal
    })
    .catch(err => console.error("Error submitting job:", err));
  }



// *********************************** JobCards ********************************

function submitjob() {
  const jobTitle = document.getElementById('jobname').value;
  const companyName = document.getElementById('comname').value;
  const location = document.getElementById('location').value;
  const jobType = document.getElementById('jobtype').value;
  const salaryMin = document.getElementById('salary').value;
  const salaryMax = document.getElementById('salary1').value;
  const deadline = document.getElementById('date').value;
  const description = document.getElementById('description').value;


  const experiencelogo = "image/experienc.png";
  const onsitelogo = "image/onsite.png";
  const packagelogo =  "image/package.png";



  const jobCard = document.createElement('div');
  jobCard.classList.add('jobscards');
  jobCard.innerHTML = `
    <div class="com-icon">
      <img src="image/" alt="${companyName} icon">
      <span>Just now</span>
    </div>
    <span>${jobTitle}</span>
    <div class="infomation">
      <div class="experience">
        <img src=${experiencelogo} alt="experience icon">
        1-3 yr Exp
      </div>
      <div class="onsite">
        <img src=${onsitelogo} alt="onsite icon"> Onsite
      </div>
      <div class="package">
        <img src=${packagelogo} alt="package icon">
        ${salaryMax}
      </div>
    </div>
    <div class="description">
      <ul>
        <li>${description}</li>
        <li>Apply before: ${deadline}</li>
      </ul>
    </div>
    <button>Apply Now</button>
  `;

const container = document.querySelector('.jobimformationcards');
container.appendChild(jobCard);

  
document.getElementById('jobModal').style.display = 'none';
document.querySelector('.createjob form')?.reset();

}


