/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import controller.GarbageCollectionController;
import model.GarbageCollectionModel;
import view.GarbageCollectionView;

public class Main {
    public static void main(String[] args) {
        // Input the amount of garbage at each station here
        int[] garbageAtStations = {1765, 2808, 952, 4206, 3102, 3902, 1292, 3985, 8324, 1928, 4426, 397, 3277};

        GarbageCollectionModel model = new GarbageCollectionModel(garbageAtStations);
        GarbageCollectionView view = new GarbageCollectionView();
        GarbageCollectionController controller = new GarbageCollectionController(model, view);

        controller.calculateAndDisplayTotalCost();
    }
}