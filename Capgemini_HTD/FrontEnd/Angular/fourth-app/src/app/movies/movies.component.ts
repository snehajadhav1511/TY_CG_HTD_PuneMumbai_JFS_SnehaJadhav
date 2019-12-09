import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {

  movies = [];

  constructor(private http: HttpClient) { }

  searchMovies(movie) {
    console.log(movie.value);
    this.http.get(`http://www.omdbapi.com/?s=${movie.value}&apikey=99b1c7dd`).subscribe(data => {
      // this.movies = data.Search;              //data.search
      console.log(data);
      console.log(this.movies);
    }, err => {
      console.log(err);
    });
  }

  ngOnInit() {
  }

}
