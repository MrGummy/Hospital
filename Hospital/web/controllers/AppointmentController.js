class AppointmentController
{
    constructor()
    {
        this.appointmentService = new AppointmentService();
        this.doctorService = new DoctorService();
        this.stateService = new StateService();
    }
    
    // DATAController
    getAllAppointment()
    {
        return this.appointmentService.getAllAppointment();
    }
    
    getAppointmentById(id)
    {
        return this.appointmentService.getAppointmentById(id);
    }
    
    getAppointmentByDoctorId(doctor_id)
    {
        return this.appointmentService.getAppointmentByDoctorId(doctor_id);
    }
    
    getDoctorById(id)
    {
        return this.doctorService.getDoctorById(id);
    }
    
    getAllDoctor()
    {
        return this.doctorService.getAllDoctor();
    }
    
    getStateById(id)
    {
        return this.stateService.getStateById(id);
    }
    
    dateParse(date)
    {
        var newDate = new Date(date);           
        var options = {
                year: 'numeric',
                month: 'long',
                day: 'numeric',
                hour: 'numeric',
                minute: 'numeric'
              };
        newDate = newDate.toLocaleString("en", options);
        
        return newDate;
    }
    
    //ViewController
    getAllAppointmentView()
    {
        var data=this.getAllAppointment();
        var result="";
        for(var i=0; i<data.length;i++)
        {
            var id=data[i].id;
            var patient_id=data[i].patient_id;
            var doctor_id=data[i].doctor_id;            
            var date = this.dateParse(data[i].date);            
            var state_id=data[i].state_id;
            var doctor=this.getDoctorById(doctor_id);
            var state=this.getStateById(state_id);
            
            var color = "#31708f";
            if (state.id === 2){color="#ff7400";}
            if (state.id === 3){color="#b9121b";}
            if (state.id === 4){color="#269926";}
            
            result += "<div class='col-lg-12 col-lg-offset-0'>"+
                        "<li class='list-group-item list-group-item-info'>"+
                          "<div class='list-group-item-addon' style='background-color: " + color + "; border: 1px solid " + color + ";'>"+
                            "<span class='glyphicon glyphicon-envelope'></span>"+
                          "</div>"+
                          "<div class='list-group-item-content'>"+
                            "<h4 class='list-group-item-heading'>" + doctor.fio + "</h4>"+
                            "<p class='list-group-item-text'>" + date + "</p>"+
                          "</div>"+
                          "<div class='list-group-item-controls'>"+
                            "<span class='label' style='background-color: " + color + ";'>" + state.name + "</span>"+
                          "</div>"+
                        "</li>"+
                      "</div>";
        }
        
        var element =document.getElementById("appointment");
        element.innerHTML = result;
    }
    
    getAppointmentByDoctorIdView(doctor_id)
    {
        
        var data=this.getAppointmentByDoctorId(doctor_id);        
        var result="";
        for(var i=0; i<data.length;i++)
        {
            var id=data[i].id;
            var patient_id=data[i].patient_id;
            var doctor_id=data[i].doctor_id;            
            var date = this.dateParse(data[i].date);            
            var state_id=data[i].state_id;
            var doctor=this.getDoctorById(doctor_id);
            var state=this.getStateById(state_id);
            
            var color = "#31708f";
            if (state.id === 2){color="#ff7400";}
            if (state.id === 3){color="#b9121b";}
            if (state.id === 4){color="#269926";}
            
            result += "<div class='col-lg-12 col-lg-offset-0'>"+
                        "<li class='list-group-item list-group-item-info'>"+
                          "<div class='list-group-item-addon' style='background-color: " + color + "; border: 1px solid " + color + ";'>"+
                            "<span class='glyphicon glyphicon-envelope'></span>"+
                          "</div>"+
                          "<div class='list-group-item-content'>"+
                            "<h4 class='list-group-item-heading'>" + doctor.fio + "</h4>"+
                            "<p class='list-group-item-text'>" + date + "</p>"+
                          "</div>"+
                          "<div class='list-group-item-controls'>"+
                            "<span class='label' style='background-color: " + color + ";'>" + state.name + "</span>"+
                            "<div class='btn-group'>"+
                              "<a href='#' data-toggle='tooltip' data-placement='top' title='Add'><span class='glyphicon glyphicon-plus'></span></a>"+
                              "<a href='#' data-toggle='tooltip' data-placement='top' title='View'><span class='glyphicon glyphicon-eye-open'></span></a>"+
                              "<a href='#' data-toggle='tooltip' data-placement='top' title='Settings'><span class='glyphicon glyphicon-cog'></span></a>"+
                            "</div>"+
                          "</div>"+
                        "</li>"+
                      "</div>";
        }
        
        var element =document.getElementById("appointment");
        element.innerHTML = result;
    }
    
    getAllDoctorView(doctor_id)
    {
        var data=this.getAllDoctor();
        var result="";        
        for(var i=0; i<data.length;i++)
        {
            var id=data[i].id;
            var fio=data[i].fio;
            if (id == doctor_id)
            {
                result += "<option selected value='" + i + "'>" + fio + "</option>"
            }
            else
            {
                result += "<option value='" + i + "'>" + fio + "</option>";
            }
        }
        
        var element =document.getElementById("doctor");
        element.innerHTML = result;
    }
}


