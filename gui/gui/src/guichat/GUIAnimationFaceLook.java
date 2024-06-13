package guichat;

import java.awt.Color;
import java.awt.Graphics;

class GUIAnimatinFaceLook { // 顔のオブジェクト

    int h = 100;
    int w = 100;

    int xStart = 0;
    int yStart = 0;

    public void setXY(int x, int y) {
        this.xStart = x;
        this.yStart = y;
    }

    public void setSize(int h, int w) {
        this.h = h;
        this.w = h;
    }

    public GUIAnimatinFaceLook() {

    }

    void makeFace(Graphics g) {
        // makeRim(g);
        makeEyes(g, w / 5);
        makeNose(g, h / 5);
        makeMouth(g, w / 2);
    }

    public void makeFace(Graphics g, String emotion) {
        // **ここにemotion毎の顔を用意する。*///
        if (emotion.equals("normal")) {
            makeEyes(g, w / 5);
            makeNose(g, h / 5);
            makeMouth(g, w / 2);
        } else if (emotion.equals("angry")) {
            makeAngryEyes(g, w / 5);
            makeAngryMouth(g, w / 2);
        }else if (emotion.equals("smile")) {
            makeSmileEyes(g, w / 5);
            makeSmileMouth(g, w / 2);
        } 
    }

    void makeEyes(Graphics g, int eyeSize) {
        g.setColor(Color.blue);
        g.fillArc(xStart + (h * 2 / 7), yStart + (w * 1 / 3), eyeSize, eyeSize, 0, 300);
        g.setColor(Color.black);
        g.drawOval(xStart + (h * 2 / 7), yStart + (w * 1 / 3), eyeSize, eyeSize);
        g.drawOval(xStart + (h * 4 / 7), yStart + (w * 1 / 3), eyeSize, eyeSize);
    }


    void makeSmileEyes(Graphics g, int eyeSize) {
        g.setColor(Color.black);
        g.fillOval(xStart + (h * 2 / 7), yStart + (w * 1 / 3), eyeSize, eyeSize);
        g.fillOval(xStart + (h * 4 / 7), yStart + (w * 1 / 3), eyeSize, eyeSize);
    }
    void makeAngryEyes(Graphics g, int eyeSize) {
        g.setColor(Color.red);
        g.fillOval(xStart + (h * 2 / 7), yStart + (w * 1 / 3), eyeSize, eyeSize);
        g.fillOval(xStart + (h * 4 / 7), yStart + (w * 1 / 3), eyeSize, eyeSize);
    }

    public void makeNose(Graphics g, int noseSize) {
        g.drawLine(xStart + (h * 1 / 2), yStart + (w * 2 / 4), xStart + (h * 1 / 2), yStart + (w * 2 / 4) + noseSize);
    }

    public void makeMouth(Graphics g, int mouseSize) {
        int xMiddle = xStart + h / 2;
        int yMiddle = yStart + 3 * w / 4;
        g.drawLine(xMiddle - mouseSize / 2, yMiddle, xMiddle + mouseSize / 2, yMiddle);
    }
    void makeAngryMouth(Graphics g, int mouthSize) {
        int xMiddle = xStart + h / 2;
        int yMiddle = yStart + 3 * w / 4;
        g.setColor(Color.red);
        g.drawArc(xMiddle - mouthSize / 2, yMiddle, mouthSize, mouthSize / 2, 0, 180);
    }
    void makeSmileMouth(Graphics g, int mouthSize) {
        int xMiddle = xStart + h / 2;
        int yMiddle = yStart + 3 * w / 4;
        g.setColor(Color.red);
        g.drawArc(xMiddle - mouthSize / 2, yMiddle-10, mouthSize, mouthSize / 2, 0, -180);
    }

}