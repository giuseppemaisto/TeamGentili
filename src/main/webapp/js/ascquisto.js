/**
 * 
 */
document.getElementById('mainContent').style.display = 'none';

    // Simula un ritardo di 10 secondi prima di mostrare il contenuto principale
    setTimeout(function () {
        // Nascondi il loading
        document.querySelector('.text-center').style.display = 'none';
        // Mostra il contenuto principale
        document.getElementById('mainContent').style.display = 'block';
    }, 5000);