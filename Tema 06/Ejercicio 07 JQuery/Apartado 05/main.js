$("document").ready(function (){
    $("input[type='submit']").click(function (){
        $("#f").bind("submit", function () {
            let corrcArray = [true, true, true, true];

            let name = $("input[name='nombre']").text();
            if (!name.match(/^[A-Z][a-z]{3}$/)) {
                corrcArray[0] = false;
                $("input[name='nombre']").css("border-color", "red");
                let nameSpan = $("<span></span>").text("Xxxx");
                $("input[name='nombre']").after(nameSpan);
            } else {
                $("input[name='nombre']").css("background-color", "green");
            }

            let tel = $("input[name='tel']").text();
            if (!tel.match(/^[0-9]{3}-[0-9]{6}$/)) {
                corrcArray[1] = false;
                $("input[name='tel']").css("border-color", "red");
                let telSpan = $("<span></span>").text("XXX-XXXXXX");
                $("input[name='tel']").after(telSpan);
            } else {
                $("input[name='tel']").css("background-color", "green");
            }

            let cp = $("input[name='cp']").text();
            if (!cp.match(/^[0-9]{5}$/)) {
                corrcArray[2] = false;
                $("input[name='cp']").css("border-color", "red");
                let cpSpan = $("<span></span>").text("XXXXX");
                $("input[name='cp']").after(cpSpan);
            } else {
                $("input[name='cp']").css("background-color", "green");
            }

            let email = $("input[name='email']").text();
            if (!email.match(/^[a-z0-9]{3}@[a-z]{4}\.[a-z]{2}$/)) {
                corrcArray[3] = false;
                $("input[name='email']").css("border-color", "red");
                let emailSpan = $("<span></span>").text("xxx@xxxx.xx");
                $("input[name='email']").after(emailSpan);
            } else {
                $("input[name='email']").css("background-color", "green");
            }

            for (const bool in corrcArray) {
                if (bool === false) {
                    return false;
                }
                return true;
            }
        });
    });
});