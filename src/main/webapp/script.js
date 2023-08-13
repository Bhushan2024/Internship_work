function addNewWEField() {
    let newNode = document.createElement("textarea");
    newNode.classList.add("form-control");
    newNode.classList.add("weField");
    newNode.classList.add("mt-2");
    newNode.setAttribute("rows", 3)
    newNode.setAttribute("placeholder", "enter here")

    let WEexperienceOb = document.getElementById("WEexperience");
    let weaddbuttonOb = document.getElementById("weaddbutton");
    WEexperienceOb.insertBefore(newNode, weaddbuttonOb)
}

function addAqField() {
    let newNode = document.createElement("textarea");
    newNode.classList.add("form-control");
    newNode.classList.add("eqField");
    newNode.classList.add("mt-2");
    newNode.setAttribute("rows", 3)
    newNode.setAttribute("placeholder", "enter here")

    let AqexperienceOb = document.getElementById("Aqexperience");
    let eqaddbuttonOb = document.getElementById("eqaddbutton");
    AqexperienceOb.insertBefore(newNode, eqaddbuttonOb)
}

function addproject() {
    let newNode = document.createElement("textarea");
    newNode.classList.add("form-control");
    newNode.classList.add("prField");
    newNode.classList.add("mt-2");
    newNode.setAttribute("rows", 3)
    newNode.setAttribute("placeholder", "enter here")

    let projectfillOb = document.getElementById("projectfill");
    let praddbuttonOb = document.getElementById("praddbutton");
    projectfillOb.insertBefore(newNode, praddbuttonOb)

}

function genrateresume() {
    let namefield = document.getElementById('namefield').value;
    let namet1 = document.getElementById('namet1');
    namet1.innerHTML = namefield;
    document.getElementById('namet2').innerHTML = namefield;
    document.getElementById('phonet').innerHTML = document.getElementById('contactfield').value;
    document.getElementById('adresst').innerHTML = document.getElementById('addressfield').value;
    document.getElementById('linkedint').innerHTML = document.getElementById('linkedinf').value;
    document.getElementById('objectivet').innerHTML = document.getElementById('ObjectiveField').value;
    document.getElementById('wet').innerHTML = document.getElementById('WEexperience').value;
}