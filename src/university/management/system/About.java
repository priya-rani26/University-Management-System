package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    String s;

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 300, 200);
        add(image);
        
        JLabel heading = new JLabel("<html>University Management System</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        s="UNIVERSITY MANAGEMENT SYSTEM (UMS) is a flagship product of Easy Solution "
                +"which covers all aspects of Universities, Colleges or Schools."
                +"UMS covers every minute aspects of a universities work flow and integrates all"
                +"processes with user friendly interface. With hundreds of satisfied customers "
                +"UMS is first choice of several state, governments/semi- government universities and institutions. "
                +"UMS is an outcome of hard work done by our expert technical team in supervision of several renowned "
                +"educationists which includes Controller of examination, faculties. UMS is a rare combination of "
                +"experience and precision. UMS streamline path of information flow in organization "
                + "by taking care of following departments:\n" + 
"Fee Department\n" +
"Examination Department\n" +
"Attendance\n" +
"Faculty information portal\n" +
"Student information portal"+
                "This project deals with the various functioning in College management process."
                +"The main idea is to implement a proper process to system. In our existing system"
                +"contains a many operations registration, student search, fees, attendance, exam records,"
                +"performance of the student etc. All these activity takeout manually by administrator.";
         TextArea t1 = new TextArea(s, 30, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20, 200, 650, 300);

        add(t1);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}