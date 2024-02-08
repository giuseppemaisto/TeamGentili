var originalOrder = [];

        function initializeOriginalOrder() {
            var cards = document.getElementsByClassName("card-container");
            originalOrder = Array.from(cards);
        }

        function searchByName() {
            var searchTerm = document.getElementById("searchInput").value.toLowerCase();
            var cards = document.getElementsByClassName("card-container");

            if (originalOrder.length === 0) {
                initializeOriginalOrder();
            }

            Array.from(cards).forEach(function(card) {
                var productName = card.querySelector(".card-title").innerText.toLowerCase();
                if (productName.includes(searchTerm)) {
                    card.style.display = "block";
                } else {
                    card.style.display = "none";
                }
            });

            var productContainer = document.getElementById("productContainer");
            originalOrder.forEach(function(product) {
                productContainer.appendChild(product);
            });
        }