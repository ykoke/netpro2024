//FacesAWTMain.java
//FacesAWTMain 目標 インナークラスのFaceObjクラスを作ってみよう。描画処理を移譲してください。
//3x3の顔を描画してください。色などもぬってオリジナルな楽しい顔にしてください。

package guibasic;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FacesAWTMain {

    public static void main(String[] args) {
        new FacesAWTMain();
    }

    FacesAWTMain() {
        FaceFrame f = new FaceFrame();
        f.setSize(800, 800);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }

    // インナークラスを定義
    class FaceFrame extends Frame {
		private FaceObj[][] faces = new FaceObj[3][3];

        FaceFrame() {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					faces[i][j] = new FaceObj(50 + i * 250, 100 + j * 250,(i + j) % 3);
				}
			}
        }

        public void paint(Graphics g) {
            super.paint(g);


            // 3x3の顔を描画
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
					faces[i][j] = new FaceObj(50 + i * 250, 100 + j * 250, (i + j) % 3);
                    faces[i][j].drawFace(g);
                }
            }
        }
    }

    // FaceObjクラスを定義
    private class FaceObj {
        private int xStart;
        private int yStart;
        private int w = 150; // 顔の幅
        private int h = 150; // 顔の高さ
		private int emotion ;

        public FaceObj(int x, int y, int emotion) {
            xStart = x;
            yStart = y;
			this.emotion = emotion;
        }

        public void drawFace(Graphics g) {
            // 顔の形状を描画
            drawRim(g);
            drawBrow(g, 30);
            drawEye(g, 35);
            drawNose(g, 40);
			if (emotion == 0) {
				drawMouth(g, 100); // 普通の口
			} else if (emotion == 1) {
				drawSmile(g, 100); // 笑顔
			} else if (emotion == 2) {
				drawSadMouth(g, 100); // 悲しい顔
			}
        }

        private void drawRim(Graphics g) {  // wが横幅、hが縦幅
            g.drawLine(xStart, yStart, xStart + w, yStart);
            g.drawLine(xStart, yStart, xStart, yStart + h);
            g.drawLine(xStart, yStart + h, xStart + w, yStart + h);
            g.drawLine(xStart + w, yStart, xStart + w, yStart + h);
        }

        private void drawBrow(Graphics g, int bx) { // xは目の幅 呼ばれる方(=定義する方)
            int xMiddle = xStart + w / 2;
            int yMiddle = yStart + h / 4;
            int browWidth = w / 4;
            g.fillRect(xMiddle - browWidth / 2-40, yMiddle, browWidth, 10); // 眉を描画
			g.fillRect(xMiddle - browWidth / 2+40, yMiddle, browWidth, 10);
        }

        private void drawNose(Graphics g, int nx) { // xは鼻の長さ
            int xMiddle = xStart + w / 2;
            int yMiddle = yStart + h / 2;
            int noseWidth = w / 10;
            int noseHeight = h / 6;
            g.fillRect(xMiddle - noseWidth / 2, yMiddle - noseHeight / 2, noseWidth, noseHeight); // 鼻を描画
        }

        private void drawEye(Graphics g, int r) { // rは目の半径
            g.drawOval(xStart + w / 4 - r / 2, yStart + h / 3, r, r);
            g.drawOval(xStart + 3 * w / 4 - r / 2, yStart + h / 3, r, r);
        }

        private void drawMouth(Graphics g, int mx) { // xは口の幅
            int xMiddle = xStart + w / 2;
            int yMiddle = yStart + h - 30;
            g.drawLine(xMiddle - mx / 2, yMiddle + 10, xMiddle + mx / 2, yMiddle);
        }
		private void drawSmile(Graphics g, int mx) { // 笑顔の口を描画
			int xMiddle = xStart + w / 2;
			int yMiddle = yStart + h - 60;
			g.drawArc(xMiddle - mx / 2, yMiddle, mx, mx / 2, 0, -180);
		}
	
		private void drawSadMouth(Graphics g, int mx) { // 悲しい顔の口を描画
			int xMiddle = xStart + w / 2;
			int yMiddle = yStart + h - 45;
			g.drawArc(xMiddle - mx / 2, yMiddle, mx, mx / 2, 0, 180);
		}
    }
}