
/* =========================================
   ZOMATO FRONTEND JAVASCRIPT
========================================= */


/* =========================================
   HEADER SCROLL EFFECT
========================================= */

const header = document.querySelector("header");

window.addEventListener("scroll", function () {

    if (window.scrollY > 50) {
        header.classList.add("scrolled");
    } else {
        header.classList.remove("scrolled");
    }

});


/* =========================================
   SEARCH INPUT
========================================= */

const searchInput = document.querySelector("main input");


searchInput.addEventListener("focus", function () {

    searchInput.placeholder = "Try Pizza, Burger, Biryani...";

});


searchInput.addEventListener("blur", function () {

    searchInput.placeholder =
        "Search for resturent, cuisine or a dish";

});


/* =========================================
   SEARCH ENTER EVENT
========================================= */

searchInput.addEventListener("keydown", function (event) {

    if (event.key === "Enter") {

        const searchValue = searchInput.value.trim();


        if (searchValue === "") {

            alert("Please enter something to search.");

        } else {

            alert("Searching for: " + searchValue);

        }

    }

});


/* =========================================
   TYPING EFFECT
========================================= */

const heading = document.querySelector("main h1");

const originalText = heading.innerText;

heading.innerText = "";

let index = 0;


function typeHeading() {

    if (index < originalText.length) {

        heading.innerText += originalText.charAt(index);

        index++;

        setTimeout(typeHeading, 70);

    }

}


/* Start typing effect */

setTimeout(typeHeading, 800);


/* =========================================
   LOGO HOVER EFFECT
========================================= */

const mainLogo = document.querySelector("main > img");


mainLogo.addEventListener("mouseenter", function () {

    mainLogo.style.transform = "scale(1.08)";

});


mainLogo.addEventListener("mouseleave", function () {

    mainLogo.style.transform = "scale(1)";

});

