import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-search-recipe',
  templateUrl: './search-recipe.component.html',
  styleUrls: ['./search-recipe.component.css']
})
export class SearchRecipeComponent  {
  @ViewChild('recipe') recipes: ElementRef;
  @ViewChild('place') places: ElementRef;
  textValue: any;

  venueList = [];
  constructor(private _http: HttpClient) {
  }

  getText() {


    this.textValue = this.recipes.nativeElement.value;

    if (this.textValue !== null) {

      var val = this.textValue;

      this._http.get(`https://translate.yandex.net/api/v1.5/tr.json/translate?key=trnsl.1.1.20190223T200927Z.69f435cc361d770e.d25f923d8a176a706cf1dba5dd1a57049658254a&text=` + val + `&lang=en-ru&[format=plain]&[options=1]`)
        .subscribe((data: any) => {
          for (var i = 0; i < 1; i++) {
            this.venueList[i] = {
              "name": data.text
            };
          }
        });
    }
  }
    }
