package br.fatec.avaliacao.poo;

import java.util.ArrayList;
import java.sql.*;

public class Disciplina {
    private long rowId;
    private String nome;
    private String ementa;
    private int ciclo;
    private double nota;
    
    public static ArrayList<Disciplina> getList(){
        ArrayList<Disciplina> list = new ArrayList<>();
        Connection con = null; Statement stmt = null; ResultSet rs =null;
        try{
            con = DBListener.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT rowid, * FROM disciplinas");
            while(rs.next()){
                list.add(new Disciplina(
                    rs.getLong("rowid"),
                    rs.getString("name"),
                    rs.getString("ementa"),
                    rs.getInt("ciclo"),
                    rs.getDouble("nota"))
                );
            }
    }catch(Exception ex){
            System.out.println(ex); 
    }
        return list;
    }
    
    public static void insert(String nome, String ementa, Integer ciclo, Double nota){
        Connection con = null;PreparedStatement stmt = null; ResultSet rs = null;
        try{
            con = DBListener.getConnection();
            stmt = con.prepareStatement("INSERT INTO disciplina VALUES(?,?,?,?)");
            stmt.setString(1, nome);
            stmt.setString(2, ementa);
            stmt.setInt(3, ciclo);
            stmt.setDouble(4, nota);
            stmt.execute();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    public static void delete(long rowid){
        Connection con = null;PreparedStatement stmt = null; ResultSet rs = null;
        try{
            con = DBListener.getConnection();
            stmt = con.prepareStatement("DELETE FROM disciplina WHERE rowid=?");
            stmt.setLong(1, rowid);
            stmt.execute();
    }catch(Exception ex){
            System.out.println(ex);
        }
    }
   public Disciplina(long rowId, String nome, String ementa, Integer ciclo, Double nota) {
        this.rowId = rowId;
        this.nome = nome;
        this.ementa = ementa;
        this.ciclo = ciclo;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public Double getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public long getRowId() {
        return rowId;
    }

    public void setRowId(long rowId) {
        this.rowId = rowId;
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }
    public static String getCreateStatement(){
        return "CREATE TABLE IF NOT EXISTS disciplina("
                + "nome VARCHAR(50) UNIQUE NOT NULL,"
                + "EMENTA VARCHAR(200) NOT NULL,"
                + "ciclo INT NOT NULL,"
                + "nota DOUBLE NOT NULL"
                +")";
    }
}
