package com.javachess.screens;

import com.javachess.Constants;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.*;

/* import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
*/
public class LoginScreen {

    public LoginScreen(JPanel parentPanel, CardLayout card) {

        JPanel panel = new JPanel(new GridLayout(5,1));
        panel.setBorder(Constants.zeroPadding);

        JLabel loginString = new JLabel(Constants.LoginScreenLabel , SwingConstants.CENTER);

        panel.add(loginString);

        JTextField userName = new JTextField();
        userName.setColumns(Constants.LoginInputCols);
        JPanel userNamePanel = FlowPanel();
        userNamePanel.add(userName);
        panel.add(userNamePanel);

        JTextField password = new JTextField();
        password.setColumns(Constants.LoginInputCols);
        JPanel passwordPanel = FlowPanel();
        passwordPanel.add(password);
        panel.add(passwordPanel);

        JButton loginButton = new JButton("Login");
        JPanel loginPanel = FlowPanel();
        loginPanel.add(loginButton);
        panel.add(loginPanel);

        panel.setPreferredSize(new Dimension(800, 600));

        parentPanel.add(panel);
        parentPanel.revalidate();
        loginButton.addActionListener(e -> {
            card.next(parentPanel);
        });
    }

    private JPanel FlowPanel() {
        JPanel panel = new JPanel(new FlowLayout());
        return panel;
    }
}
