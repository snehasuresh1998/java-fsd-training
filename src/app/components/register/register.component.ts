import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { CommmonService } from 'src/app/commmon.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  register:any=FormGroup;
  id:any=9;
  constructor(private fb:FormBuilder,private router:Router,private commonService:CommmonService) { }

  ngOnInit(): void {
    this.register=this.fb.group({
      username:['',Validators.required],
      password:['',Validators.compose([Validators.required])]
    })
  }
  registerSubmit(data:any)
  {
    console.log(data);
    let dataToPass={
      username:data.username,
      password:data.password,
      id:this.id++
    }
    this.commonService.addUser(dataToPass).subscribe((data:any)=>{console.log(data);
    })
  }
  goToLogin()
  {
    this.router.navigate(['login'])
  }
  }


