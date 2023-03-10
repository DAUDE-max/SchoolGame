package Entitys;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Entity {
    public int wX, wY;
    public int speed;

    public String direction;

    public BufferedImage up1, up2, down1, down2, right1, right2, left1, left2;

    public int eC = 0;
    public int eN = 1;

    public boolean colli=false;
    public Rectangle hitBox;
    public int hitBoxX, hitBoxY;

    public boolean contains(final int[] array, final int key) {
        for (final int i : array) {
            if (i == key) {
                return false;
            }
        }
        return true;
    }

}
