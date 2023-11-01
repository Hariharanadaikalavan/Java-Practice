document.getElementById('btnadd').addEventListener("click",add);
 

function add()
 {
    var result= document.getElementById("textbox").value;
    listNode=document.getElementById("list");
   liNode=document.createElement("li");
   textNode=document.createTextNode(result);
   

   liNode.appendChild(textNode);
   listNode.appendChild(liNode);

 }
