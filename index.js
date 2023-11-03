var arr=[];
  

document.getElementById('btnid').addEventListener("click",addtotable)

function addtotable(){

   var stockItem = document.getElementById("textbox").value;
   arr.push(stockItem);
   document.getElementById('textbox').value="";
   add();
}

function add()
{
   var registernumber=0;
   var emptystr=" ";
  
   
    arr.forEach(() =>
    {
      registernumber=registernumber+1;

      emptystr=emptystr+ `<tr><td> ${registernumber} </td><td> ${textbox} </td></tr><tr>`;   
    })
    document.getElementById('table').innerHTML=emptystr;
}
