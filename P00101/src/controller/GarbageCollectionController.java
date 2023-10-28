/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.GarbageCollectionModel;
import view.GarbageCollectionView;


/**
 *
 * @author Admin
 */
public class GarbageCollectionController {
    private GarbageCollectionModel model;
    private GarbageCollectionView view;

    public GarbageCollectionController(GarbageCollectionModel model, GarbageCollectionView view) {
        this.model = model;
        this.view = view;
    }

    public void calculateAndDisplayTotalCost() {
        model.calculateCost();
        view.printTotalCost(model.getTotalCost());
    }
}
