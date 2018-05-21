/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.user;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListModel;

/**
 *
 * @author 
 */
class MainFrame extends JFrame{

    protected JButton buttonAdd = new JButton("Add a Person into the Network");
    protected JButton buttonSearch = new JButton("Select a Person & Display the Person");
    protected JButton buttonSort = new JButton("Delete a Person");
     protected JButton buttonPeople = new JButton("People Connected");
 
    protected JList<Person> listPerson = new JList<>();
    protected CustomListModel<Person> listModel;
    protected java.util.List<Person> persons = new ArrayList<>();
 
    public MainFrame() {
        super("Welcome to MiniNet Application");
 
        initComponents();
 
        setSize(900, 580);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    protected void initComponents() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JPanel panelButton = new JPanel();
        panelButton.setLayout(new FlowLayout(FlowLayout.CENTER));
 
        buttonAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addPerson();
            }
        });
 
        buttonSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deletePerson();
            }
        });
 
        buttonSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                searchPersons();
            }
        });
         
        buttonPeople.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                buttonPeople();
            }
        });
 
        panelButton.add(buttonAdd);
        panelButton.add(buttonSearch);
        panelButton.add(buttonSort);
         panelButton.add(buttonPeople);
 
        add(panelButton);
 
        listPerson.setPreferredSize(new Dimension(400, 360));
 
        listModel = new CustomListModel<Person>(persons);
        listPerson.setModel((ListModel<Person>) listModel);
 
        listModel.addElement(new Person("John Doe"));
 
        add(listPerson);
    }
 
    private void addPerson() {
        String personName = JOptionPane.showInputDialog(this, "Enter person name");
        if (personName != null) {
            listModel.addElement(new Person(personName));
        }
    }
    
     private void buttonPeople() {
        String personName1 = JOptionPane.showInputDialog(this, "Enter Person 1 name to Compare with :");
        String personName2 = JOptionPane.showInputDialog(this, "Enter Person 2 name to check : ");
        if (personName1 == null && personName2==null) {
            return;
        }
        Collections.sort(persons);
        int foundIndex = Collections.binarySearch(persons, new Person(personName1));
        int foundIndex1 = Collections.binarySearch(persons, new Person(personName2));
        if (foundIndex >= 0 && foundIndex1>=0) {
            if(foundIndex==foundIndex1) {
                JOptionPane.showMessageDialog(this, "User Not Application for this ");
            }
            else{
                JOptionPane.showMessageDialog(this, "Relation Found ");
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Could not find the person " + personName1);
        }
        
    }
 
    private void sortPersons() {
        Collections.sort(persons);
        listModel.fireDataChanged();
    }
        private void deletePerson() {
        String personName = JOptionPane.showInputDialog(this, "Enter person name to delete for:");
 
        if (personName == null) {
            return;
        }
 
        Collections.sort(persons);
 
        int foundIndex = Collections.binarySearch(persons, new Person(personName));
 
        if (foundIndex >= 0) {
            listPerson.remove(this);
            listModel.removeElement(new Person(personName));
            JOptionPane.showMessageDialog(this, "DELETED " + personName);
        } else {
            JOptionPane.showMessageDialog(this, "Could not find the person " + personName);
        }
    }
    
    private void searchPersons() {
        String personName = JOptionPane.showInputDialog(this, "Enter person name to search for:");
 
        if (personName == null) {
            return;
        }
 
        Collections.sort(persons);
 
        int foundIndex = Collections.binarySearch(persons, new Person(personName));
 
        if (foundIndex >= 0) {
            listPerson.setSelectedIndex(foundIndex);
        } else {
            JOptionPane.showMessageDialog(this, "Could not find the person " + personName);
        }
    }
}
    
