// Depurador de Tokens
function handleKeyPressParser(event) {
    if (event.keyCode === 13) {
        parseInput();
    }
}

function parseInput() {
    const input = document.getElementById('input').value;

    fetch('/lexer', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(input)
    })
    .then(response => response.text())
    .then(data => {
        document.getElementById('output').innerText = data;
    })
    .catch(error => {
        console.error('Error:', error);
    });
}

// Tradutor de Tokens


function handleKeyPressPostfix(event) {
    if (event.keyCode === 13) {
        postfixInput();
    }
}

function postfixInput(){

    const input = document.getElementById('input').value;

    fetch('/traducao', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(input)
    })
    .then(response => response.text())
    .then(data => {
        document.getElementById('output').innerText = data;
    })
    .catch(error => {
        console.error('Error:', error);
    });

}