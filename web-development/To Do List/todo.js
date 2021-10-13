let addb = document.getElementById("add");
let con = document.getElementById("contain");
let inpf = document.getElementById("inp");

addb.addEventListener("click", function() {
    var paragraph = document.createElement('p');
    paragraph.classList.add('paragraph-styling');
    paragraph.innerText = inpf.value;
    con.appendChild(paragraph);
    inpf.value = "";
    paragraph.addEventListener('click', function() {
        paragraph.style.textDecoration = "line-through";
    })
    paragraph.addEventListener("dblclick", function() {
        con.removeChild(paragraph);
    })
})