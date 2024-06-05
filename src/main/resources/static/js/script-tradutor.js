function handleKeyPressPostfix(event) {
    if (event.keyCode === 13) {
        postfixInput();
    }
}

function postfixInput() {
    const entrada = document.getElementById('input').value;

    fetch('/traducao', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(entrada)
    })
    .then(response => response.text())
    .then(data => {
        document.getElementById('output').innerText = data;
    })
    .catch(error => {
        console.error('Erro:', error);
    });
}
