import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormArray } from '@angular/forms';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {
  registrationForm:FormGroup;

  constructor() { }

  ngOnInit(): void {
    this.registrationForm=new FormGroup({
      email:new FormControl(),
      password:new FormControl(),
      skills:new FormArray([
        new FormControl(),
      ])
    });
  }
  get email(){
    return this.registrationForm.get('email');
  }
  get password(){
    return this.registrationForm.get('password');
  }
  get skills(){
    return this.registrationForm.get('skills') as FormArray;
  }
  addSkills(){
    this.skills.push(new FormControl());
  }
  removeSkill(index:number){
    this.skills.removeAt(index);
  }
  submitForm(){
    console.log(this.registrationForm.value);
    // console.log(this.email);
    // this.registrationForm.reset();
    console.log(this.skills);
  }

}
