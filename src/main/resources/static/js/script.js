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
