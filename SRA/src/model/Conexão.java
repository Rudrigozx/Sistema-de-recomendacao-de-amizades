package model;
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class Conexão {
    PreparedStatement pstn;
    Connection c;
    ResultSet rs;
    ArrayList<Pessoa> banco = new ArrayList<>();
    public Connection conectBD(){

        try{
            String url = "jdbc:mysql://localhost:3306/new_schema?user=root&password=";
            c = DriverManager.getConnection(url);


        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return c;
    }

    public  ArrayList<Pessoa> listaPessoa(){
        String sql ="select * from mytable";
        try {
            pstn = c.prepareStatement(sql);
            rs= pstn.executeQuery();
            while (rs.next()){
                Pessoa pessoa = new Pessoa();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("name"));
                pessoa.setIdade(rs.getInt("idade"));
                pessoa.setSexo(rs.getString("Sexo"));
                pessoa.setTime(rs.getString("Time"));
                pessoa.setInteresses(rs.getString("Hobby"),rs.getString("generoFilmes"),rs.getString("interessesEstudo"));

                banco.add(pessoa);
            }
        }catch (SQLException er){
            JOptionPane.showMessageDialog(null,er.getMessage());
        }
        return banco;
    }

}
