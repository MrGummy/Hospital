class DoctorController
{
    constructor()
    {
        this.doctorService = new DoctorService();
    }
    
    // DATAController
    getAllDoctor()
    {
        return this.doctorService.getAllDoctor();
    }
    
    getDoctorById(id)
    {
        return this.doctorService.getDoctorById(id);
    }
    
    //ViewController
    getAllDoctorView()
    {
        var data=this.getAllDoctor();
        var result="";
        for(var i=0; i<data.length;i++)
        {
            var id=data[i].id;
            var fio=data[i].fio;
            var specialization=data[i].specialization;
            var number_phone=data[i].number_phone;
            var photo=data[i].photo;
            result += "<div class='item-listing small-padding-bg' style='margin-bottom: 10px; background-color: #eee;'>"+
                        "<div class='container'>"+
                            "<div class='row'>"+
                                "<div class='col-md-3'> <img src='data:image/png;base64," + photo + "' alt=''>"+
                                    "</div>"+
                                        "<div class='col-md-9 home-list-pop-desc inn-list-pop-desc'> <a href='#' onclick='doctorClick(" + id + ")'><h3>" + fio + "</h3></a>"+
                                            "<p class='spec' style='font-size: 1.2em;'><b>Specialization: </b> " + specialization + "</p>"+
                                            "<p><b>Phone: </b> " + number_phone + "</p>"+
                                            "<p><br></p>"+        
                                            "<div class='col-lg-offset-1 list-enquiry'>"+
                                                "<ul>"+
                                                "<li class='btn btn-md btn-warning'><a onclick='makeAppointment(" + id + ")' href='#appointment' style='color: #fff; text-decoration: none;'><i class='fa fa-star-o' aria-hidden='true'></i> Make an appointment</a> </li>"+
                                                "<li class='btn btn-md btn-warning'><a href='#message' style='color: #fff; text-decoration: none;'><i class='fa fa-commenting-o' aria-hidden='true'></i> Send message</a> </li>"+			
                                                "</ul>"+
                                            "</div>"+
                                        "</div>"+
                            "</div>"+
                        "</div>"+
                      "</div>";
        }
        
        var element =document.getElementById("doctor");
        element.innerHTML = result;
    }
    
    getDoctorByIdView(id)
    {
        var data=this.getDoctorById(id);
        var result="";
        var id=data.id;
        var fio=data.fio;
        var specialization=data.specialization;
        var number_phone=data.number_phone;
        var photo=data.photo;
        result += "<div class='row'>"+
                  "<div class='col-md-3 col-xs-12 col-sm-6 col-lg-3'>"+
                    "<div class='thumbnail text-center photo_view_postion_b' >"+
                      "<img src='data:image/png;base64," + photo + "' alt=''>"+
                    "</div>"+
                  "</div>"+
                  "<div class='col-md-9 col-xs-12 col-sm-6 col-lg-9'>"+
                      "<div class='' style='border-bottom:1px solid black'>"+
                        "<h2>" + fio + "</h2>"+
                      "</div>"+
                        "<hr>"+
                      "<div class='col-md-7'>"+
                          "<div><p><span class='glyphicon glyphicon-earphone one' style='width:50px;'></span>" + number_phone + "</p></div>"+
                          "<div><p><span class='glyphicon glyphicon-plus-sign one' style='width:50px;'></span>" + specialization + "</p></div>"+
                      "</div>"+
                      "<div class='list-enquiry' style='text-align: right;'>"+
                          "<ul>"+
                          "<li class='btn btn-md btn-warning'><a onclick='makeAppointment(" + id + ")' href='#appointment' style='color: #fff; text-decoration: none;'><i class='fa fa-star-o' aria-hidden='true'></i> Make an appointment</a> </li>"+
                          "<li class='btn btn-md btn-warning'><a href='#message' style='color: #fff; text-decoration: none;'><i class='fa fa-commenting-o' aria-hidden='true'></i> Send message</a> </li>"+			
                          "</ul>"+
                      "</div>"+
                  "</div>"+
                "</div>"+                
                "<div class='row'>"+
                  "<div class='form-group row'>"+
                    "<div class='col-md-12'>"+                    
                    "<div class='form-group' style='border-bottom:1px solid black'>"+
                        "<h2>CONTACT INFO</h2>"+
                    "</div>"+
                    "</div>"+
                  "</div>"+
                "</div>"+
                "<div class='row'>"+
                 "<div class='col-md-4'>"+
                    "<div class='col-sm-6 col-xs-6 tital ' >Height(feet):</div><div class='col-sm-6 col-xs-6 contant_i'>Prasad</div>"+
                    "<div class='clearfix'></div><div class='bot-border'></div>"+
                    "<div class='col-sm-6 col-xs-6 tital ' >Weight(lbs):</div><div class='col-sm-6 col-xs-6 contant_i'>Prasad</div>"+
                    "<div class='clearfix'></div><div class='bot-border'></div>"+
                    "<div class='col-sm-6 col-xs-6 tital ' >Hair Color:</div><div class='col-sm-6 col-xs-6 contant_i'>Prasad</div>"+
                    "<div class='clearfix'></div><div class='bot-border'></div>"+
                    "<div class='col-sm-6 col-xs-6 tital ' >Hair Length:</div><div class='col-sm-6 col-xs-6 contant_i'>Prasad</div>"+
                    "<div class='clearfix'></div><div class='bot-border'></div>"+
                    "<div class='col-sm-6 col-xs-6 tital ' >Suit/Dress:</div><div class='col-sm-6 col-xs-6 contant_i'>Prasad</div>"+
                    "<div class='clearfix'></div><div class='bot-border'></div>"+
                 "</div>"+
                 "<div class='col-md-4'>"+
                    "<div class='col-sm-6 col-xs-6 tital ' >Shirt Size:</div><div class='col-sm-6 col-xs-6 contant_i'>Prasad</div>"+
                    "<div class='clearfix'></div><div class='bot-border'></div>"+
                    "<div class='col-sm-6 col-xs-6 tital ' >Shoe Size:</div><div class='col-sm-6 col-xs-6 contant_i'>Prasad</div>"+
                    "<div class='clearfix'></div><div class='bot-border'></div>"+
                    "<div class='col-sm-6 col-xs-6 tital ' >Bust:</div><div class='col-sm-6 col-xs-6 contant_i'>Prasad</div>"+
                    "<div class='clearfix'></div><div class='bot-border'></div>"+
                    "<div class='col-sm-6 col-xs-6 tital ' >Waist:</div><div class='col-sm-6 col-xs-6 contant_i'>Prasad</div>"+
                    "<div class='clearfix'></div><div class='bot-border'></div>"+
                    "<div class='col-sm-6 col-xs-6 tital ' >Inseam:</div><div class='col-sm-6 col-xs-6 contant_i'>Prasad</div>"+
                    "<div class='clearfix'></div><div class='bot-border'></div>"+
                 "</div>"+
                 "<div class='col-md-4'>"+
                    "<div class='col-sm-6 col-xs-6 tital ' >Hips:</div><div class='col-sm-6 col-xs-6 contant_i'>Prasad</div>"+
                    "<div class='clearfix'></div><div class='bot-border'></div>"+
                    "<div class='col-sm-6 col-xs-6 tital ' >Glove:</div><div class='col-sm-6 col-xs-6 contant_i'>Prasad</div>"+
                    "<div class='clearfix'></div><div class='bot-border'></div>"+
                    "<div class='col-sm-6 col-xs-6 tital ' >Hat:</div><div class='col-sm-6 col-xs-6 contant_i'>Prasad</div>"+
                    "<div class='clearfix'></div><div class='bot-border'></div>"+
                 "</div>"+
                "</div>";
        
        var element =document.getElementById("doctor");
        element.innerHTML = result;
    }
}