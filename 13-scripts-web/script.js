
const form = document.getElementById('form-Filme');
const tableBody = document.querySelector('#lista-filme tbody');

let filme = [];

form.addEventListener('submit', function(event) {
    event.preventDefault();
    const nome = document.getElementById('nome').value;
    const nota = document.querySelector('input[name="nota"]:checked').value;

    filme.push({ nome, nota });
    renderTable();
    form.reset();
});


function renderTable() {
    tableBody.innerHTML = '';
    filme.forEach((item, index) => {
        const row = `
            <tr>
                <td class="nome-filme">${item.nome}</td>
                <td>${renderStars(item.nota)}</td>
                <td>
                    <button class="btn-js-edit" onclick="editItem(${index})"><i class="fa-solid fa-pen-to-square"></i></button>
                </td>
                <td>
                    <button class="btn-js-delete" onclick="deleteItem(${index})"><i class="fa-solid fa-trash"></i></button>
                </td>
            </tr>
        `;
        tableBody.insertAdjacentHTML('beforeend', row);
    });
}

function getCheckedStars() {
    const checkboxes = document.querySelectorAll('input[name="nota"]');
    let nota = 0;
    checkboxes.forEach(checkbox => {
        if (checkbox.checked) {
            nota = parseInt(checkbox.value);
        }
    });
    return nota;
}

function renderStars(nota) {
    let estrelas = '';
    for (let i = 1; i <= 5; i++) {
        if (i <= nota) {
            estrelas += '★';
        }else {
            estrelas += '☆';
        }
    }
    return estrelas;
}

function editItem(index) {
    const item = filme[index];
    const newNome = prompt('Digite o novo Nome:', item.nome);
    const newNota = parseInt(prompt('Digite a nova Nota:', item.nota));
    if (newNome !== null && !isNaN(newNota) && newNota >= 1 && newNota <= 5) {
        filme[index].nome = newNome;
        filme[index].nota = newNota;
        renderTable();
    } else {
        alert('Erro! Tente Novamente!');
    }
}

function deleteItem(index) {
    const confirmation = confirm('Deseja excluir este filme?');
    if (confirmation) {
        filme.splice(index, 1);
        renderTable();
    }
}
