package com.example.atividade3.dwiiiatividade3.model;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Candidato {
    private String nome;
    private LocalDate dataNasc;
    private String idioma;
    private String[] habilidades;
    private final DateTimeFormatter customFormatter;

    public Candidato () {
        customFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (!nome.isBlank()) {
            this.nome = nome;
            return false;
        }
        return true;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public boolean setDataNasc(String dataNasc) {
        LocalDate dataNascFormated;
        try {
            dataNascFormated = LocalDate.parse(dataNasc, customFormatter);
        }
        catch (DateTimeParseException e) {
            return true;
        }
        this.dataNasc = dataNascFormated;
        return false;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }
}
