import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class RepositorioPessoa {
    PreparedStatement pstn;
    Connection c;
    ResultSet rs;
    ArrayList<Pessoa> banco = new ArrayList<Pessoa>();
    public Connection conectBD(){

        try{
            String url = "jdbc:mysql://localhost:3306/new_schema?user=root&password=";
            c = DriverManager.getConnection(url);


        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return c;
    }

    public  ArrayList<Pessoa> listaVertice(){
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

     public ArrayList<Pessoa> listarPessoaTXT(String arquivo) throws FileNotFoundException, IOException{
      
        FileReader arq = new FileReader(arquivo);
        //armazenando conteudo no arquivo no buffer
        BufferedReader lerArq = new BufferedReader(arq);
        //lendo a primeira linha
        String linha = lerArq.readLine();

        //ArrayListe para armazenar os objetos da leitura
        ArrayList pessoas = new ArrayList();
        int id = 0;

        //a variavel linha recebe o valor 'null' quando chegar no final do arquivo
        while (linha != null){
            //Criando o objeto p da classe pessoa
            Pessoa p = new Pessoa();
            //criando um array que recebe os atributos divididos pelo split
            String[] atributos = linha.split(",");
            //passando os "atributos" da array para o objeto p
            p.setNome(atributos[0]);
            int idade = (int) Integer.parseInt(atributos[1]);
            p.setIdade(idade);
            p.setSexo(atributos[2]);
            p.setTime(atributos[3]);
            p.setInteresses(atributos[4],atributos[5],atributos[6]);
            p.setId(id);
            pessoas.add(p);
            //capturando a proxima linha
            linha = lerArq.readLine();
            id++; //atribuir o id a cada objeto
        }
        return pessoas;
   
    }
}
