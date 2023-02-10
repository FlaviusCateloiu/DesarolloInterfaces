$(document).ready(function () {
   $("#empezar").click(function () {
      $("#secundario").animate({height: '200px', opacity: '0.4'}, "slow");
      $("#secundario").animate({width: '200px', opacity: '1'}, "slow");
      $("#secundario").animate({height: '50px', opacity: '0.4'}, "slow");
      $("#secundario").animate({width: '50px', opacity: '1'}, "slow");
   });
});