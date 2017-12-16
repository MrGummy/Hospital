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
            result += "<div class='row'>"+
                        "<div class='col-sm-12 col-md-12'>"+
                          "<div class='thumbnail'>"+
                            "<img src='data:image/png;base64,"+ photo +"'/>"+
                            "<div class='caption'>"+
                              "<h3>"+fio+"</h3>"+
                              "<p>"+specialization+"</p>"+
                              "<p align='right'>"+number_phone+"</p>"+
                            "</div>"+
                          "</div>"+
                        "</div>"+
                      "</div>";
        }
        
        var element =document.getElementById("doctor");
        element.innerHTML = result;
    }
}