const greet = (name) => {
    alert('Hello ${name}');
}

const logNames = async () => {
  const response = await fetch("/api/names");
  const names = await response.json();
  return names;
}

(() => {
console.log("It works!");
const namesEl = document.querySelector('#names');
    logNames()
    .then(names => {
        namesEl.innerHTML = names.join(" | ");
    })
})();