import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { CommmonService } from 'src/app/commmon.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
   login:any=FormGroup;
   users:any=[];
  
  constructor(private fb:FormBuilder,private router:Router,private commonService:CommmonService) { }

  ngOnInit(): void {
    this.login=this.fb.group({
      username:['',Validators.required],
      password:['',Validators.compose([Validators.required])]
    })
    this.commonService.getUser().subscribe((data:any)=>{  this.users=data; } )
  
  }
loginSubmit(data:any)
{
if(data.username){
  this.users.forEach((item:any) => {
    if(item.username=== data.username && item.password===data.password)
    {
      localStorage.setItem("isLoggedIn","true");
      this.router.navigate(['home']);
    }
    else
    {
      localStorage.clear();
    }
    
  });
}
}
goToSignup()
{
  this.router.navigate(['register'])
}
}
