const addbtn=document.querySelector(".add");
const input=document.querySelector(".inputfield");



addbtn.addEventListener("click",addInput);

function addInput(){
    
    const name=document.createElement("input")
    name.type="text";
    name.placeholder="Enter your Name";


    const email=document.createElement("input")
    email.type="password";
    email.placeholder="Enter your password";

        

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
   
}




function removeInput()
{
    this.parentElement.remove();
}

