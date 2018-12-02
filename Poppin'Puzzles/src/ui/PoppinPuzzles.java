package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PoppinPuzzles extends JFrame implements ActionListener {

    private JPanel panel = new JPanel();
    private JLabel genericLabel = new JLabel();
    private Notification popup;
    private static final String TITLE = "Poppin' Puzzles";

    private JButton pauseButton = new JButton("PAUSE");
    private JButton fishButton = new JButton("EASY");
    private JButton birdButton = new JButton("MEDIUM");
    private JButton dogButton = new JButton("HARD");
    private JButton hecticButton = new JButton("EXPERT");
    private JButton playButton = new JButton("PLAY");
    private JButton backButton = new JButton("BACK");
    private JButton settingsButton = new JButton("SETTINGS");
    private JButton quitButton = new JButton("QUIT");

    private JLabel labeltl = new JLabel();
    private JLabel labeltml = new JLabel();
    private JLabel labeltmr = new JLabel();
    private JLabel labeltr = new JLabel();
    private JLabel labelmtl = new JLabel();
    private JLabel labelmtml = new JLabel();
    private JLabel labelmtmr = new JLabel();
    private JLabel labelmtr = new JLabel();
    private JLabel labelmbl = new JLabel();
    private JLabel labelmbml = new JLabel();
    private JLabel labelmbmr = new JLabel();
    private JLabel labelmbr = new JLabel();
    private JLabel labelbl = new JLabel();
    private JLabel labelbml = new JLabel();
    private JLabel labelbmr = new JLabel();
    private JLabel labelbr = new JLabel();

    private ImageIcon startScreen = new ImageIcon(HOME_JPG);

    private ImageIcon pauseIcon = new ImageIcon(PAUSE_JPG);
    private ImageIcon fishIcon = new ImageIcon(FISH_JPG);
    private ImageIcon birdIcon = new ImageIcon(BIRD_PUZZLE_JPG);
    private ImageIcon dogIcon = new ImageIcon(DOG_JPG);

    private static final String HOME_JPG = "Imaging/Home.jpg";

    //DOG
    private static final String DOG_JPG = "Imaging/Dog/Dog.jpg";
    private static final String DOG_TL_JPG = "Imaging/Dog/Dog_TL.jpg";
    private static final String DOG_TML_JPG = "Imaging/Dog/Dog_TML.jpg";
    private static final String DOG_TMR_JPG = "Imaging/Dog/Dog_TMR.jpg";
    private static final String DOG_TR_JPG = "Imaging/Dog/Dog_TR.jpg";
    private static final String DOG_MTL_JPG = "Imaging/Dog/Dog_MTL.jpg";
    private static final String DOG_MTML_JPG = "Imaging/Dog/Dog_MTML.jpg";
    private static final String DOG_MTMR_JPG = "Imaging/Dog/Dog_MTMR.jpg";
    private static final String DOG_MTR_JPG = "Imaging/Dog/Dog_MTR.jpg";
    private static final String DOG_MBL_JPG = "Imaging/Dog/Dog_MBL.jpg";
    private static final String DOG_MBML_JPG = "Imaging/Dog/Dog_MBML.jpg";
    private static final String DOG_MBMR_JPG = "Imaging/Dog/Dog_MBMR.jpg";
    private static final String DOG_MBR_JPG = "Imaging/Dog/Dog_MBR.jpg";
    private static final String DOG_BL_JPG = "Imaging/Dog/Dog_BL.jpg";
    private static final String DOG_BML_JPG = "Imaging/Dog/Dog_BML.jpg";
    private static final String DOG_BMR_JPG = "Imaging/Dog/Dog_BMR.jpg";
    private static final String DOG_BR_JPG = "Imaging/Dog/Dog_BR.jpg";

    private ImageIcon dtl = new ImageIcon(DOG_TL_JPG);
    private ImageIcon dtml = new ImageIcon(DOG_TML_JPG);
    private ImageIcon dtmr = new ImageIcon(DOG_TMR_JPG);
    private ImageIcon dtr = new ImageIcon(DOG_TR_JPG);
    private ImageIcon dmtl = new ImageIcon(DOG_MTL_JPG);
    private ImageIcon dmtmL = new ImageIcon(DOG_MTML_JPG);
    private ImageIcon dmtmr = new ImageIcon(DOG_MTMR_JPG);
    private ImageIcon dmtr = new ImageIcon(DOG_MTR_JPG);
    private ImageIcon dmbl = new ImageIcon(DOG_MBL_JPG);
    private ImageIcon dmbml = new ImageIcon(DOG_MBML_JPG);
    private ImageIcon dmbmr = new ImageIcon(DOG_MBMR_JPG);
    private ImageIcon dmbr = new ImageIcon(DOG_MBR_JPG);
    private ImageIcon dbl = new ImageIcon(DOG_BL_JPG);
    private ImageIcon dbmL = new ImageIcon(DOG_BML_JPG);
    private ImageIcon dbmr = new ImageIcon(DOG_BMR_JPG);
    private ImageIcon dbr = new ImageIcon(DOG_BR_JPG);
    //BIRD
    private static final String BIRD_PUZZLE_JPG = "Imaging/Bird/Bird_Puzzle.jpg";
    private static final String BIRD_TL_JPG = "Imaging/Bird/Bird_TL.jpg";
    private static final String BIRD_TM_JPG = "Imaging/Bird/Bird_TM.jpg";
    private static final String BIRD_TR_JPG = "Imaging/Bird/Bird_TR.jpg";
    private static final String BIRD_ML_JPG = "Imaging/Bird/Bird_ML.jpg";
    private static final String BIRD_MM_JPG = "Imaging/Bird/Bird_MM.jpg";
    private static final String BIRD_MR_JPG = "Imaging/Bird/Bird_MR.jpg";
    private static final String BIRD_BL_JPG = "Imaging/Bird/Bird_BL.jpg";
    private static final String BIRD_BM_JPG = "Imaging/Bird/Bird_BM.jpg";
    private static final String BIRD_BR_JPG = "Imaging/Bird/Bird_BR.jpg";

    private ImageIcon tl = new ImageIcon(BIRD_TL_JPG);
    private ImageIcon tm = new ImageIcon(BIRD_TM_JPG);
    private ImageIcon tr = new ImageIcon(BIRD_TR_JPG);
    private ImageIcon ml = new ImageIcon(BIRD_ML_JPG);
    private ImageIcon mm = new ImageIcon(BIRD_MM_JPG);
    private ImageIcon mr = new ImageIcon(BIRD_MR_JPG);
    private ImageIcon bl = new ImageIcon(BIRD_BL_JPG);
    private ImageIcon bm = new ImageIcon(BIRD_BM_JPG);
    private ImageIcon br = new ImageIcon(BIRD_BR_JPG);

    private static final String FISH_JPG = "Imaging/Fish/Fish.jpg";
    private static final String FISH_TL_JPG = "Imaging/Fish/Fish_TL.jpg";
    private static final String FISH_TR_JPG = "Imaging/Fish/Fish_TR.jpg";
    private static final String FISH_BL_JPG = "Imaging/Fish/Fish_BL.jpg";
    private static final String FISH_BR_JPG = "Imaging/Fish/Fish_BR.jpg";

    private ImageIcon ftl = new ImageIcon(FISH_TL_JPG);
    private ImageIcon ftr = new ImageIcon(FISH_TR_JPG);
    private ImageIcon fbl = new ImageIcon(FISH_BL_JPG);
    private ImageIcon fbr = new ImageIcon(FISH_BR_JPG);

    private static final String PAUSE_JPG = "Imaging/Pause/Pause.jpg";

    public PoppinPuzzles() {
        super(TITLE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Stops program after X is hit, prevents multiple instances from running
        pauseButton.addActionListener(this);
        fishButton.addActionListener(this);
        birdButton.addActionListener(this);
        dogButton.addActionListener(this);
        hecticButton.addActionListener(this);
        playButton.addActionListener(this);
        backButton.addActionListener(this);
        settingsButton.addActionListener(this);
        quitButton.addActionListener(this);
        addAllLabels();
        new MouseEvents(panel.getComponents());
        run();
    }

    //MODIFIES: this
    //EFFECTS: sets title, dimensions, location of UI
    public void center() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = screenSize.width / 2 - getWidth() / 2;
        int y = screenSize.height / 2 - getHeight() / 2;
        setLocation(x, y);
    }

    public void addAllLabels() {
        panel.add(labelmbr);
        panel.add(labelbl);
        panel.add(labeltmr);
        panel.add(labelmtl);
        panel.add(labelmbml);
        panel.add(labelmtmr);
        panel.add(labelbmr);
        panel.add(labelmtr);
        panel.add(labeltr);
        panel.add(labelmtml);
        panel.add(labelmbl);
        panel.add(labelmbmr);
        panel.add(labelbml);
        panel.add(labeltl);
        panel.add(labelbr);
        panel.add(labeltml);
    }

    public void add2x2Labels() {
        panel.add(labelbr);
        panel.add(labelbl);
        panel.add(labeltr);
        panel.add(labeltl);
    }

    public void add3x3Labels() {
        panel.add(labeltl);
        panel.add(labeltml);
        panel.add(labeltr);
        panel.add(labelmtl);
        panel.add(labelmtmr);
        panel.add(labelmtr);
        panel.add(labelbl);
        panel.add(labelbr);
        panel.add(labelbml);
    }

    public void run() {
        panel.removeAll();
        genericLabel.setIcon(startScreen);
        panel.setBackground(Color.orange);
        setSize(startScreen.getIconWidth() + 20, startScreen.getIconHeight() + 100);
        panel.add(genericLabel);
        panel.add(playButton);
        panel.add(settingsButton);
        panel.add(quitButton);
        add(panel);
        center();
        setVisible(true);
        addAllLabels();
    }

    public void drawFish() {
        panel.removeAll();
        setSize(fishIcon.getIconWidth() + 50, fishIcon.getIconHeight() + 100);
        panel.setBackground(Color.CYAN);

        labeltl.setIcon(ftl);
        labeltr.setIcon(ftr);
        labelbl.setIcon(fbl);
        labelbr.setIcon(fbr);

        add2x2Labels();

        panel.add(pauseButton);
        panel.add(birdButton);
        panel.add(dogButton);
        center();
        setVisible(true);
    }

    //REQUIRES: String of one of imagetypes
    //MODIFIES: this
    //EFFECTS: sets Icon of given image onto UI
    public void drawBird() {
        setSize(birdIcon.getIconWidth() + 50, birdIcon.getIconHeight() + 110);
        panel.setBackground(Color.GREEN);
        panel.removeAll();

        labeltl.setIcon(tl);
        labeltml.setIcon(bl);
        labeltr.setIcon(tm);
        labelmtl.setIcon(tr);
        labelmtmr.setIcon(bm);
        labelmtr.setIcon(mr);
        labelbl.setIcon(mm);
        labelbml.setIcon(ml);
        labelbr.setIcon(br);

        add3x3Labels();

        panel.add(pauseButton);
        panel.add(fishButton);
        panel.add(dogButton);
        center();
        setVisible(true);
    }

    public void drawDog() {
        setSize(dogIcon.getIconWidth() + 50, dogIcon.getIconHeight() + 110);
        panel.setBackground(Color.RED);
        panel.removeAll();

        labeltl.setIcon(dtl);
        labeltml.setIcon(dtml);
        labeltmr.setIcon(dtmr);
        labeltr.setIcon(dtr);

        labelmtl.setIcon(dmtl);
        labelmtml.setIcon(dmtmL);
        labelmtmr.setIcon(dmtmr);
        labelmtr.setIcon(dmtr);

        labelmbl.setIcon(dmbl);
        labelmbml.setIcon(dmbml);
        labelmbmr.setIcon(dmbmr);
        labelmbr.setIcon(dmbr);

        labelbl.setIcon(dbl);
        labelbml.setIcon(dbmL);
        labelbmr.setIcon(dbmr);
        labelbr.setIcon(dbr);

        addAllLabels();

        panel.add(fishButton);
        panel.add(birdButton);
        panel.add(pauseButton);

        center();
        setVisible(true);
    }

    public void pauseGame() {
        panel.removeAll();
        setSize(pauseIcon.getIconWidth() + 50, pauseIcon.getIconHeight() + 75 + pauseButton.getHeight());
        panel.setBackground(Color.BLACK);
        genericLabel.setIcon(pauseIcon);
        panel.add(genericLabel);

        panel.add(birdButton);
        panel.add(fishButton);
        panel.add(dogButton);
        center();
        setVisible(true);
        System.out.println("Game has been paused");
    }

    public void displayOptions() {
        panel.removeAll();
        panel.add(fishButton);
        panel.add(birdButton);
        panel.add(dogButton);
        panel.add(hecticButton);
        panel.add(backButton);
        panel.add(quitButton);
        panel.add(genericLabel);
        center();
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == playButton) {
            displayOptions();
        }
        if (e.getSource() == backButton) {
            run();
        }
        if (e.getSource() == settingsButton) {
            popup = new Notification("Nice try, no reason for changes");
            popup.center();
        }
        if (e.getSource() == quitButton) {
            System.exit(0);
        }
        if (e.getSource() == fishButton) {
            drawFish();
        }
        if (e.getSource() == birdButton) {
            drawBird();
        }
        if (e.getSource() == dogButton) {
            drawDog();
        }
        if (e.getSource() == hecticButton) {
            popup = new Notification("Don't kid yourself");
            popup.center();
        }
        if (e.getSource() == pauseButton) {
            pauseGame();
        }
    }

    //EFFECTS: runs Poppin'Puzzles
    public static void main(String[] args) {
        new PoppinPuzzles();
    }

    public void make3x3Puzzle(String jpg) {
        panel.removeAll();
        ImageIcon icon = new ImageIcon(jpg);
        int x = icon.getIconWidth() % 3;
        int y = icon.getIconHeight() % 3;
        genericLabel.setIcon(icon);
        genericLabel.setSize(x,y);
        genericLabel.setSize(new Dimension(x,y));
        panel.add(genericLabel);
        center();
        setVisible(true);
    }
}
