import { Component } from '@angular/core';
import { Ingredients } from '../shared/ingredients.model';

@Component({
  selector: 'app-shopping-list',
  templateUrl: './shopping-list.component.html',
  styleUrls: ['./shopping-list.component.css']
})
export class ShoppingListComponent {
  ingredients:Ingredients[] =[
    new Ingredients("Apples",5),
    new Ingredients("Tomato",10)
  ];

  constructor(){

  }

  onIngredientEdit(ingredient:Ingredients){
    this.ingredients.push(ingredient);
  }
}
