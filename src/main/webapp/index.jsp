<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
    </head>
    <body>
        <form action="ProcessoVaga" method="post">
            <p>
                Nome: </br>
                <input type="text" name="field_nome" value="" required>
            </p>

            <p>
                Data de Nascimento: </br>
                <input type="text" name="field_dataNasc" placeholder="dd/mm/aaaa" required>
            </p>

            <p>
                Idioma nativo:

                </br>
                <input type="radio" name="field_idiomaNativo" value="PORTUGUES" required>
                <label>Português</label>

                <input type="radio" name="field_idiomaNativo" value="INGLES" required>
                <label>Inglês</label>

                <input type="radio" name="field_idiomaNativo" value="ESPANHOL" required>
                <label>Espanhol</label>
            </p>

            <p>
                Habilidades Técnicas:

                </br>
                <input type="checkbox" name="field_habTech" value="Java">
                <label>Java</label>

                <input type="checkbox" name="field_habTech" value="Javascript">
                <label>Javascript</label>

                <input type="checkbox" name="field_habTech" value="HTML">
                <label>HTML</label>

                <input type="checkbox" name="field_habTech" value="CSS">
                <label>CSS</label>

            </p>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>