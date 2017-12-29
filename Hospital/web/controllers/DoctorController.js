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
                                                "<li onclick='makeAppointment(" + id + ")' class='btn btn-md btn-warning'><a href='#appointment' style='color: #fff; text-decoration: none;'><i class='fa fa-star-o' aria-hidden='true'></i> Make an appointment</a> </li>"+			
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
                          "<li onclick='makeAppointment(" + id + ")' class='btn btn-md btn-warning'><a href='#appointment' style='color: #fff; text-decoration: none;'><i class='fa fa-star-o' aria-hidden='true'></i> Make an appointment</a> </li>"+		
                          "</ul>"+
                      "</div>"+
                  "</div>"+
                "</div>"+                
                "<div class='row'>"+
                  "<div class='form-group row'>"+
                    "<div class='col-md-12'>"+                    
                    "<div class='form-group' style='border-bottom:1px solid black'>"+
                        "<h2>INFO</h2>"+
                    "</div>"+
                    "</div>"+
                  "</div>"+
                "</div>"+
                "<div class='row'>"+
                 "<div class='col-md-12'>"+
                    "<p>A Doctor of Medicine (MD from Latin Medicinae Doctor) is a medical degree, the meaning of"+
                        "which varies between different jurisdictions. In some countries, the MD denotes a first professional"+
                        "graduate degree awarded upon initial graduation from medical school. In other countries, the MD"+
                        "denotes an academic research doctorate, higher doctorate, honorary doctorate or advanced clinical"+
                        "coursework degree restricted to medical graduates; in those countries, the equivalent first"+
                        "professional degree is titled differently (for example, Bachelor of Medicine, Bachelor of Surgery in"+
                        "countries following the tradition of the United Kingdom) </p>"+
                 "</div>"+
                "</div>";
        
        var element =document.getElementById("doctor");
        element.innerHTML = result;
    }
    
    authentication()
    {
        var authUserName=document.getElementById("inputlogin").value;
        var authPassword=document.getElementById("inputpass").value;
        
        authUserName=authUserName.toLowerCase();
        
        var data=this.getAllDoctor();
        for(var i=0; i<data.length;i++)
        {
            var userName=data[i].user_name;
            var password=data[i].password;
            if (authUserName == userName && authPassword == password)
            {
                /*document.getElementById("user").value = userName;
                document.getElementById("cancel").click();*/
                
                var element =document.getElementById("success");
                element.innerHTML = "<a href='#' onclick='doctorClick(" + data[i].id + ")'><h3>" + userName + "</h3></a>";
                
                return 1;
            }                
        }
        
        //document.getElementById("userName").value = "ERROR!!!!!!!";
        return 0;
    }
}