$(document).ready(function () {
    // AÑADIR CLUB
    $("#registro-club").on("submit", function (event) {
        event.preventDefault(); // Evita el envío por defecto del formulario

        const nombreClub = $("#clubR").val().trim();
        const email = $("#correo").val().trim();
        const contraseña = $("#contraseña2").val();

        // Validación del formulario
        if (!nombreClub || !email || !contraseña) {
            alert("Por favor, completa todos los campos.");
            return;
        }

        // Obtener los datos del formulario
        const formData = {
            nombreClub: nombreClub,
            emailClub: email,
            passwordClub: contraseña
        };

        console.log("Datos del formulario:", formData);  // Añadir logging para verificar los datos

        // Hacer la solicitud POST para añadir el club
        $.ajax({
            url: "http://localhost:8080/api/clubs",
            type: "POST",
            contentType: "application/json", // Indicar el tipo de contenido
            data: JSON.stringify(formData), // Convertir los datos a formato JSON
            success: function (response) {
                alert("Club añadido exitosamente.");
                console.log("Club añadido:", response);
            },
            error: function (xhr, status, error) {
                console.error("Error al añadir el club:", error);
                alert("Error al añadir el club.");
            }
        });
    });
});
