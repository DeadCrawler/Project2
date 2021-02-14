package ui;

import listeners.MainFormButtonListener;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class MainMenu {


    public MainMenu() {
        JFrame jFrame = new JFrame("CRUD");
        Container container = new Container(jFrame);

        JLabel idLabel = new JLabel();
        idLabel.setFont(new Font("Verdana", 0, 12));
        idLabel.setText("Id");
        idLabel.setBounds(82, 50, 80, 20);


        JLabel fnameLabel = new JLabel();
        fnameLabel.setFont(new java.awt.Font("Verdana", 0, 12));
        fnameLabel.setText("First name");
        fnameLabel.setBounds(60, 80, 80, 20);


        JLabel lnameLabel = new JLabel();
        lnameLabel.setFont(new java.awt.Font("Verdana", 0, 12));
        lnameLabel.setText("Last Name");
        lnameLabel.setBounds(60, 110, 80, 20);


        JLabel ageLabel = new JLabel();
        ageLabel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        ageLabel.setText("Age");
        ageLabel.setBounds(75, 140, 80, 20);


        JLabel cityLabel = new JLabel();
        cityLabel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cityLabel.setText("City");
        cityLabel.setBounds(76, 170, 80, 20);


        JLabel titleLabel = new JLabel();
        titleLabel.setFont(new Font("Tahoma", 0, 18));
        titleLabel.setText("CRUD APPLICATION");
        titleLabel.setBounds(160, 5, 180, 30);


        JTextField txtId = new JTextField();
        txtId.setBounds(200, 50, 240, 20);
        JTextField txtFname = new JTextField();
        txtFname.setBounds(200, 80, 240, 20);
        JTextField txtLname = new JTextField();
        txtLname.setBounds(200, 110, 240, 20);
        JTextField txtAge = new JTextField();
        txtAge.setBounds(200, 140, 240, 20);
        JTextField txtCity = new JTextField();
        txtCity.setBounds(200, 170, 240, 20);


        //DROPDOWN
        // container ,

        JButton btnExit = new JButton("Exit");

        JButton btnSave = new JButton();
        btnSave.setText("Create");
        btnSave.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        btnSave.setIconTextGap(0);
        btnSave.setInheritsPopupMenu(true);
        btnSave.setBounds(15, 400, 100, 30);

        JButton btnRead = new JButton();
        btnRead.setText("Read");
        btnRead.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        btnRead.setIconTextGap(0);
        btnRead.setInheritsPopupMenu(true);
        btnRead.setBounds(135, 400, 100, 30);

        JButton btnUpdate = new JButton();
        btnUpdate.setText("Update");
        btnUpdate.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        btnUpdate.setBounds(255, 400, 100, 30);

        JButton btnDelete = new JButton();
        btnDelete.setText("Delete");
        btnDelete.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        btnDelete.setBounds(375, 400, 100, 30);

        ActionListener mainFormButtonListener = new MainFormButtonListener(btnRead, btnUpdate, btnSave, btnDelete,  btnExit,
                txtId, txtFname, txtLname, txtAge, txtCity);

        btnSave.addActionListener(mainFormButtonListener);
        btnRead.addActionListener(mainFormButtonListener);
        btnUpdate.addActionListener(mainFormButtonListener);
        btnDelete.addActionListener(mainFormButtonListener);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setTitle("CRUD");
        jFrame.setResizable(false);


        jFrame.setBounds(0, 0, 500, 500);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.add(idLabel);
        jFrame.add(fnameLabel);
        jFrame.add(lnameLabel);
        jFrame.add(ageLabel);
        jFrame.add(cityLabel);
        jFrame.add(titleLabel);
        jFrame.add(txtId);
        jFrame.add(txtFname);
        jFrame.add(txtLname);
        jFrame.add(txtAge);
        jFrame.add(txtCity);
        jFrame.add(btnSave);
        jFrame.add(btnRead);
        jFrame.add(btnUpdate);
        jFrame.add(btnDelete);
        jFrame.setVisible(true);
        container.getTable().drawTable();
    }
}