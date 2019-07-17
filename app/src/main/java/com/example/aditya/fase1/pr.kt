package com.example.aditya.fase1

class Developer(val developerId:Int , var companyName:String,var address:String)
{

}

class Housing(val housingId:Int , var developer:Int ,var name:String  ,var address:String,
                  val latitude:Double ,val longtitude:Double )
{

}
class House(val houseId:Int,var housing:Int ,var developer:Int ,var name:String ,
            var address:String ,var latitude:Double,var longtitude:Double , var price:Double )
{

}



