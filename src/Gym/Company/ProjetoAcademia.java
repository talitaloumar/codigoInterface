package Gym.Company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;


 Scanner s = new Scanner(System.in);

public class ProjetoAcademia {
    private JPanel panel1;
    private JFormattedTextField formattedTextField1;
    private JButton ENVIAR;
    private JCheckBox alunoACheckBox;
    private JCheckBox administraçãoCheckBox;
    public JCheckBox professorACheckBox;
    private JFormattedTextField c_id;
    private JFormattedTextField c_endereco;
    private JFormattedTextField c_tel;
    private JFormattedTextField c_email;
    private JFormattedTextField c_nasc;
    private JFormattedTextField c_ultimoNome;
    private JFormattedTextField c_sobreNome;
    String private JFormattedTextField c_nome;
    private JRadioButton C_professor;
    private JRadioButton c_aluno;
    private JRadioButton c_admin;

    import java.util.Scanner;


    public ProjetoAcademia(JFormattedTextField formattedTextField1, JButton enviar, JCheckBox alunoACheckBox, JCheckBox administraçãoCheckBox,
                           JCheckBox professorACheckBox, JFormattedTextField c_id, JFormattedTextField c_endereco, JFormattedTextField c_tel,
                           JFormattedTextField c_email, JFormattedTextField c_nasc, JFormattedTextField c_ultimoNome, JFormattedTextField c_sobreNome,
                           JFormattedTextField c_nome)
    {

        this.formattedTextField1 = formattedTextField1;
        ENVIAR = enviar;
        this.alunoACheckBox = alunoACheckBox;
        this.administraçãoCheckBox = administraçãoCheckBox;
        this.professorACheckBox = professorACheckBox;
        this.c_id = c_id;
        this.c_endereco = c_endereco;
        this.c_tel = c_tel;
        this.c_email = c_email;
        this.c_nasc = c_nasc;
        this.c_ultimoNome = c_ultimoNome;
        this.c_sobreNome = c_sobreNome;
        this.c_nome = c_nome;
        panel1.addComponentListener(new ComponentAdapter() {
        });
        ENVIAR.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {


            }

        });
        professorACheckBox.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String professorACheckBox = s.nextLine();


            }
        });
        administraçãoCheckBox.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        alunoACheckBox.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void createUIComponents() {



    }
}
