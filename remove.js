const addbtn=document.querySelector(".add");
const input=document.querySelector(".inputfield");



addbtn.addEventListener("click",addInput);

function addInput(){
    
    const name=document.createElement("input")
    name.type="text";
    name.placeholder="Enter your Name";


    const email=document.createElement("input")
    email.type="email";
    email.placeholder="Enter your E-mail";

    const password=document.createElement("input");
    password.type="password";
    password.placeholder="Enter your password";
    

    const btn=document.createElement("a")
    btn.className="delete";
    btn.innerHTML="&times";

    btn.addEventListener("click", removeInput);
    
    const flex=document.createElement("div");
    flex.className="flex";
    
    input.appendChild(flex);
    flex.appendChild(name);
    flex.appendChild(email)
    flex.appendChild(btn);
    flex.appendChild(password);
}




function removeInput()
{
    this.parentElement.remove();
}

