import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class trainRes {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Train Reservation System");

        JLabel namelb = new JLabel("Person Name");
        namelb.setBounds(200,30,120,40);
        JTextField nametf = new JTextField();
        nametf.setBounds(320,30,180,40);

        JLabel startlb = new JLabel("Journey Start Date");
        startlb.setBounds(20,100,120,40);
        JTextField starttf = new JTextField();
        starttf.setBounds(140,100,180,40);

        JLabel endlb = new JLabel(" Journey End Date");
        endlb.setBounds(350,100,120,40);
        JTextField endtf = new JTextField();
        endtf.setBounds(470,100,180,40);

        JLabel fromlb = new JLabel(" FROM ");
        fromlb.setBounds(40,200,120,40);
        JTextField fromtf = new JTextField();
        fromtf.setBounds(140,200,180,40);

        JLabel tolb = new JLabel(" TO");
        tolb.setBounds(390,200,120,40);
        JTextField totf = new JTextField();
        totf.setBounds(470,200,180,40);

        JLabel amountlb = new JLabel("Amount");
        amountlb.setBounds(40,300,120,40);
        JTextField amounttf = new JTextField();
        amounttf.setBounds(140,300,180,40);


        JLabel bookingIdlb = new JLabel(" Booking ID");
        bookingIdlb.setBounds(370,300,120,40);
        JTextField bookingIdtf = new JTextField();
        bookingIdtf.setBounds(470,300,180,40);


        JButton clearBtn = new JButton("Clear");
        clearBtn.setBounds(30, 400, 120, 50);

        JButton bookNowBtn = new JButton("Book Now");
        bookNowBtn.setBounds(250, 400, 120, 50);

        JButton exitBtn = new JButton("Exit");
        exitBtn.setBounds(470, 400, 120, 50);


        frame.add(namelb);
        frame.add(nametf);
        frame.add(startlb);
        frame.add(starttf);
        frame.add(endlb);
        frame.add(endtf);
        frame.add(fromlb);
        frame.add(fromtf);
        frame.add(tolb);
        frame.add(totf);
        frame.add(clearBtn);
        frame.add(bookNowBtn);
        frame.add(exitBtn);
        frame.add(amountlb);
        frame.add(amounttf);
        frame.add(bookingIdlb);
        frame.add(bookingIdtf);

        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(700, 600);
        frame.setVisible(true);
        bookNowBtn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nametf.getText().toString().isEmpty()||starttf.getText().toString().isEmpty()||
                        endtf.getText().toString().isEmpty()||amounttf.getText().toString().isEmpty()||
                        fromtf.getText().toString().isEmpty()|| totf.getText().toString().isEmpty())
                {
                    bookingIdlb.setText("Please fill the complete details");
                }
                else {

                    Random random = new Random();
                    int id = random.nextInt(99999);
                    bookingIdlb.setText("Your booking is confirmed and booking ID " + id);
                }
            }
        });
    }
}
