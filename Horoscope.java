// Burcunu Hesaplayıp Açıklama Yapan Program:
    Date birthdate = Date.newInstance(1982,3,25);
    Integer day = birthdate.day();
    Integer month = birthdate.month();
    // system.debug(birthdate);
    //system.debug(day);
    //system.debug(month);
    String returned;
             
             

if  ((month==12 && day>=22) || (month==1 && day<=19)) { system.debug('Capricorn') ; returned = 'Capricorn';
    } else if ((month == 1 && day >= 20)  || (month == 2 && day <= 17)) { system.debug('Aquarius'); returned= 'Aquarius';
    } else if ((month == 2 && day >= 18)  || (month == 3 && day <= 19)) { system.debug('Pisces'); returned='Pisces';
    } else if ((month == 3 && day >= 20)  || (month == 4 && day <= 19)) { system.debug('Aries'); returned = 'Aries';
    } else if ((month == 4 && day >= 20)  || (month == 5 && day <= 20)) { system.debug ('Taurus'); returned = 'Taurus';
    } else if ((month == 5 && day >= 21)  || (month == 6 && day <= 20)) { system.debug ('Gemini'); returned = 'Gemini';
    } else if ((month == 6 && day >= 21)  || (month == 7 && day <= 22)) { system.debug('Cancer'); returned = 'Cancer';
    } else if ((month == 7 && day >= 23)  || (month == 8 && day <= 22)) { system.debug ('Leo'); returned = 'Leo';
    } else if ((month == 8 && day >= 23)  || (month == 9 && day <= 22)) { system.debug('Virgo'); returned ='Virgo';
    } else if ((month == 9 && day >= 23)  || (month == 10 && day <= 22)) { system.debug ('Libra'); returned = 'Libra';
    } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) { system.debug ('Scorpio'); returned = 'Scorpio';
    } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) { system.debug('Sagittarius');returned = 'Sagittarius';
    } else {returned= null;
    }             

// System.debug(returned);
              
 // String returned= 'Capricorn';
 switch on returned {

     when 'Capricorn'{ System.debug('Maddi dünyaya verdikleri önemin yanı sıra manevi dünyaları da hayli geniştir.');
     } when 'Aquarius'{ System.debug('Kova burçları genellikle bağımsızdır ve tek hareket etmeyi severler. İnsanlar arası ilişkilerde sabırlıdırlar. ');
     } when 'Pisces'{ System.debug('Balık burçları diğer burçlara göre daha bilgilidirler.');
     } when 'Aries'{ System.debug('Aries burcu olanlar genellikle ön planda olmayı seviyor. Çok cesur ve hırslılar. ');                
     } when 'Taurus'{ System.debug('Boğalar durumların gerektirdiği üzere çeşitli bakış açıları takınabilirler.');
     } when 'Gemini'{ System.debug('İkizler burcu çok fazla duyguyu aynı anda yaşayabilirler. Yani değişken bir kişiliğe sahiptirler.');
     } when 'Cancer'{ System.debug('Yengeç burcu mutluluk peşinde koşan biridir. İçe dönüktürler bu nedenle kalabalığı pek sevmezler.');
     } when 'Leo'{ System.debug('Aslan burcu olan kişiler genellikle canlı ve sempatiktirler.');
     } when 'Virgo'{ System.debug('Başak burcu iş tamamlayıcıdır. Fiziksel ve mental olarak sürekli kendini geliştirmek ister.');
     } when 'Libra'{ System.debug('Adalet sembolüyle bilinen terazi burcu eşitlik ve adalete hayli önem verir. Dengeli olmak esastır.');
     } when 'Scorpio'{ System.debug('Akrep burcu başkalarına çok önem verir. Her ne kadar duygusal olsa da bunu pek belli etmez. ');
     } when 'Sagittarius'{ System.debug('Yay belki de burçlar arasında en enerjik olanıdır.');                   
     } when else {System.debug('Invalid input');
}
} 