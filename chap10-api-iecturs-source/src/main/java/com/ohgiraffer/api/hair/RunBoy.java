package com.ohgiraffer.api.hair;

import com.ohgiraffer.api.member.Member;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.time.LocalDateTime;

public class RunBoy {

    public static void main(String[] args) {

        String str = "1,Devin,Rossey,drossey0@state.tx.us,Male,,2024-09-04,20:22,2012-10-10T07:55:50\n" +
                "2,Alice,Krause,akrause1@about.com,Female,1983/04/04,2024-06-01,16:16,2011-09-08T17:09:39\n" +
                "3,Elinore,Girauld,egirauld2@sciencedaily.com,Female,1989/01/19,2024-01-13,16:21,2012-12-04T19:37:08\n" +
                "4,Guntar,Snowsill,gsnowsill3@uol.com.br,Male,,2024-05-10,9:14,2015-10-15T11:04:16\n" +
                "5,Nye,Lazell,nlazell4@exblog.jp,Male,,2024-11-20,16:16,2011-03-29T01:21:27\n" +
                "6,Krystle,LePort,kleport5@pcworld.com,Female,1979/10/20,2024-09-28,8:39,2023-01-27T11:05:10\n" +
                "7,Shannan,Hunnicot,shunnicot6@go.com,Male,,2024-07-23,19:02,2017-06-16T10:07:30\n" +
                "8,Munroe,Gossling,mgossling7@pbs.org,Male,1990/02/21,2024-10-21,10:35,2010-05-01T00:28:26\n" +
                "9,Terrie,Crab,tcrab8@google.nl,Female,1972/10/31,2024-03-13,15:42,2021-09-10T11:50:54\n" +
                "10,Stesha,Mulles,smulles9@myspace.com,Female,1999/10/28,2024-11-30,15:48,2013-08-02T19:24:55\n" +
                "11,Alvinia,Aers,aaersa@chicagotribune.com,Female,1965/10/25,2024-02-22,13:00,2024-01-16T02:47:31\n" +
                "12,Melosa,Tidy,mtidyb@chron.com,Bigender,1966/10/16,2024-04-25,19:00,2010-03-27T03:10:39\n" +
                "13,Modesta,Chesser,mchesserc@wordpress.com,Female,,2024-12-05,13:38,2022-04-29T00:40:20\n" +
                "14,Rosy,Paffot,rpaffotd@hostgator.com,Female,,2024-05-23,21:15,2020-04-27T06:52:34\n" +
                "15,Ewen,Allbon,eallbone@businesswire.com,Male,,2024-06-29,13:24,2012-12-21T05:38:55\n" +
                "16,Felizio,McAlroy,fmcalroyf@ucoz.com,Male,2001/12/26,2024-04-01,16:08,2024-01-16T19:37:00\n" +
                "17,Lane,Escalera,lescalerag@google.es,Female,1992/10/28,2024-01-18,10:35,2023-06-27T12:42:46\n" +
                "18,Halsy,Boxer,hboxerh@prnewswire.com,Male,1965/05/17,2024-07-10,10:56,2012-11-05T23:53:37\n" +
                "19,Katusha,O'Crevan,kocrevani@howstuffworks.com,Female,1987/04/19,2024-02-27,20:23,2017-05-28T01:39:58\n" +
                "20,Jessie,Hencke,jhenckej@accuweather.com,Female,,2024-05-14,15:16,2018-07-24T09:27:44\n" +
                "21,Elijah,Vardey,evardeyk@simplemachines.org,Male,1964/03/31,2024-09-14,20:44,2016-11-28T05:21:14\n" +
                "22,Robby,Frearson,rfrearsonl@rambler.ru,Female,1971/04/17,2024-06-07,8:07,2023-06-03T21:23:06\n" +
                "23,Gloriana,Riby,gribym@google.de,Female,1975/02/01,2024-07-22,10:20,2016-02-09T07:54:38\n" +
                "24,Sheffield,Doyland,sdoylandn@sbwire.com,Male,2003/03/19,2024-10-09,21:45,2017-05-18T03:46:20\n" +
                "25,Caresa,Elsbury,celsburyo@intel.com,Female,1977/12/17,2024-01-02,12:21,2014-01-04T07:29:28\n" +
                "26,Dougie,Lownes,dlownesp@sitemeter.com,Male,1986/02/03,2024-10-22,19:51,2019-07-22T17:52:45\n" +
                "27,Hillary,Bernardez,hbernardezq@meetup.com,Female,,2024-12-04,19:01,2018-12-03T22:13:04\n" +
                "28,Haley,Joinson,hjoinsonr@thetimes.co.uk,Male,2002/06/26,2024-09-22,12:15,2021-05-07T04:02:24\n" +
                "29,Ede,Goering,egoerings@netvibes.com,Female,1978/12/06,2024-02-21,18:51,2019-12-03T07:37:30\n" +
                "30,Ardenia,Dunphie,adunphiet@indiatimes.com,Female,1994/07/04,2024-03-09,19:40,2015-09-30T21:12:46\n" +
                "31,Danya,Gallear,dgallearu@yahoo.co.jp,Agender,,2024-01-07,17:18,2019-01-14T00:42:38\n" +
                "32,Fiorenze,Filippo,ffilippov@prweb.com,Female,,2024-03-01,12:50,2014-12-04T17:12:26\n" +
                "33,Blane,Besset,bbessetw@topsy.com,Male,1988/03/19,2024-10-02,12:02,2016-03-07T22:37:27\n" +
                "34,Caitlin,Celloni,ccellonix@prlog.org,Female,2004/08/29,2024-01-25,15:01,2017-10-24T15:45:55\n" +
                "35,Esra,Raitt,eraitty@printfriendly.com,Male,1974/08/08,2024-06-10,18:58,2010-07-17T16:19:54\n" +
                "36,Rosene,Millhill,rmillhillz@bandcamp.com,Female,1964/01/04,2024-02-23,12:20,2011-05-23T20:50:14\n" +
                "37,Adela,Croyden,acroyden10@youtube.com,Female,1989/04/07,2024-06-23,18:17,2019-04-19T22:15:47\n" +
                "38,Malinde,Kuhlmey,mkuhlmey11@ehow.com,Female,1980/10/09,2024-06-17,17:51,2023-10-18T21:33:37\n" +
                "39,Kale,Ughetti,kughetti12@xinhuanet.com,Male,2004/12/20,2024-03-28,17:28,2020-11-01T15:11:07\n" +
                "40,Marlow,Baytrop,mbaytrop13@mozilla.org,Male,,2024-07-07,14:32,2014-02-21T12:10:16\n" +
                "41,Marina,Brocket,mbrocket14@whitehouse.gov,Female,,2024-05-07,12:26,2013-04-22T17:15:36\n" +
                "42,Ruy,Cornuau,rcornuau15@imgur.com,Genderqueer,1991/12/28,2024-09-28,18:37,2016-09-21T14:49:17\n" +
                "43,Harcourt,Clemmey,hclemmey16@weibo.com,Male,2000/01/27,2024-10-12,20:38,2023-03-27T09:20:35\n" +
                "44,Hubert,Spender,hspender17@printfriendly.com,Male,1961/02/22,2024-07-20,11:53,2022-10-25T15:32:19\n" +
                "45,Valery,Davies,vdavies18@sourceforge.net,Female,1977/03/31,2024-10-02,19:59,2022-05-22T09:25:17\n" +
                "46,Matthew,Wegener,mwegener19@scientificamerican.com,Male,1992/05/20,2024-09-23,13:52,2014-11-11T07:09:28\n" +
                "47,Orson,Schubart,oschubart1a@deliciousdays.com,Male,1970/09/01,2024-05-15,20:10,2014-12-15T05:40:00\n" +
                "48,Melonie,Hendrich,mhendrich1b@hostgator.com,Female,1996/04/15,2024-05-23,13:09,2013-02-12T08:48:59\n" +
                "49,Jeanette,Prandoni,jprandoni1c@whitehouse.gov,Female,2003/09/24,2024-02-12,15:19,2022-10-18T22:38:05\n" +
                "50,Ira,Sarl,isarl1d@sourceforge.net,Female,1963/01/19,2024-08-18,11:58,2013-07-29T00:13:58\n" +
                "51,Lucie,Possek,lpossek1e@accuweather.com,Female,,2024-08-23,10:46,2012-08-05T12:03:26\n" +
                "52,Marcelo,Loney,mloney1f@odnoklassniki.ru,Male,2001/04/20,2024-01-03,17:36,2017-01-06T00:04:15\n" +
                "53,Dalis,Wagner,dwagner1g@ebay.com,Male,1987/09/11,2024-07-24,20:35,2017-07-02T13:45:35\n" +
                "54,Jillene,McAneny,jmcaneny1h@last.fm,Female,1993/09/04,2024-04-07,21:57,2022-11-06T11:32:52\n" +
                "55,Brandi,Reinhard,breinhard1i@webs.com,Female,1998/05/31,2024-11-14,13:59,2015-11-25T16:06:52\n" +
                "56,Nessa,Duffill,nduffill1j@last.fm,Female,,2024-10-24,21:30,2023-12-26T12:43:26\n" +
                "57,Rowena,Yegorovnin,ryegorovnin1k@jiathis.com,Female,,2024-02-28,10:02,2011-05-12T10:57:45\n" +
                "58,Corrinne,Peinke,cpeinke1l@hexun.com,Female,1994/06/11,2024-09-15,15:54,2016-07-22T07:18:48\n" +
                "59,Don,Ashington,dashington1m@redcross.org,Male,1984/03/18,2024-08-16,13:58,2012-04-04T05:17:55\n" +
                "60,Staffard,Cathrae,scathrae1n@cmu.edu,Male,1983/01/01,2024-01-10,19:41,2015-05-22T06:02:16\n" +
                "61,Dolf,Papps,dpapps1o@icio.us,Male,1965/08/28,2024-05-02,9:15,2012-11-12T22:29:33\n" +
                "62,Sigmund,Ortzen,sortzen1p@mediafire.com,Male,1995/02/18,2024-04-23,21:04,2015-05-18T04:13:16\n" +
                "63,Tybie,Carlaw,tcarlaw1q@telegraph.co.uk,Female,1994/06/06,2024-10-06,13:38,2016-06-25T10:41:47\n" +
                "64,Lindsay,Lutas,llutas1r@sourceforge.net,Male,1987/06/12,2024-10-17,14:06,2018-04-22T10:28:36\n" +
                "65,Rosemonde,Jaggi,rjaggi1s@rambler.ru,Female,,2024-07-06,20:22,2011-11-24T21:05:22\n" +
                "66,Erica,Hodgins,ehodgins1t@dell.com,Female,,2024-02-14,19:36,2019-11-23T03:33:23\n" +
                "67,Eduardo,Darell,edarell1u@yellowbook.com,Male,1987/12/30,2024-09-10,9:45,2014-03-21T11:48:37\n" +
                "68,Hercules,Gertray,hgertray1v@twitpic.com,Male,1992/09/20,2024-04-05,15:51,2019-04-06T21:51:50\n" +
                "69,Lorilyn,Cutriss,lcutriss1w@domainmarket.com,Female,,2024-10-08,18:01,2016-11-29T08:12:43\n" +
                "70,Pren,Leithgoe,pleithgoe1x@ca.gov,Male,,2024-07-02,10:14,2023-04-30T09:14:02\n" +
                "71,Cesar,Aubury,caubury1y@buzzfeed.com,Male,,2024-07-08,11:42,2020-06-15T12:59:40\n" +
                "72,Mortie,Fitzsymons,mfitzsymons1z@photobucket.com,Male,,2024-06-16,13:53,2016-09-27T11:30:13\n" +
                "73,Fulvia,Cust,fcust20@prnewswire.com,Female,,2024-05-17,10:43,2019-06-04T04:58:07\n" +
                "74,Joby,Hollingdale,jhollingdale21@seesaa.net,Genderfluid,,2024-04-27,15:25,2021-10-01T06:04:36\n" +
                "75,Hollie,Deackes,hdeackes22@sfgate.com,Female,,2024-08-30,20:17,2018-06-27T07:01:03\n" +
                "76,Michel,Densun,mdensun23@1und1.de,Male,,2024-02-09,13:44,2021-09-10T09:36:48\n" +
                "77,Vilma,Aizikovich,vaizikovich24@yellowbook.com,Female,,2024-01-12,10:10,2010-12-14T01:55:21\n" +
                "78,Nelli,Stovold,nstovold25@jalbum.net,Female,,2024-07-30,12:47,2018-08-16T19:31:18\n" +
                "79,Loren,Bodocs,lbodocs26@mashable.com,Male,1978/11/15,2024-01-31,15:54,2017-02-18T00:50:12\n" +
                "80,Gorden,Macauley,gmacauley27@topsy.com,Male,,2024-03-30,15:44,2014-12-06T12:42:33\n" +
                "81,Wilfred,MacPaden,wmacpaden28@hostgator.com,Male,2004/11/17,2024-05-13,17:22,2015-08-26T05:19:24\n" +
                "82,Dex,Duggan,dduggan29@samsung.com,Agender,1969/10/02,2024-09-01,18:38,2012-11-25T08:08:42\n" +
                "83,Eada,Sellwood,esellwood2a@live.com,Female,1997/06/11,2024-06-27,21:37,2014-09-03T04:32:54\n" +
                "84,Hannah,Fincken,hfincken2b@nytimes.com,Female,,2024-08-03,15:40,2011-04-03T10:20:24\n" +
                "85,Osgood,Hammant,ohammant2c@apple.com,Male,1964/08/02,2024-08-03,14:53,2019-07-16T20:38:53\n" +
                "86,Dame,Sparry,dsparry2d@theguardian.com,Male,1990/06/22,2024-01-09,21:46,2014-04-08T10:42:37\n" +
                "87,Daile,Margach,dmargach2e@feedburner.com,Female,,2024-08-18,19:59,2015-06-14T03:16:49\n" +
                "88,Cynthie,Knoller,cknoller2f@meetup.com,Female,,2024-08-07,9:18,2012-07-13T18:15:43\n" +
                "89,Nicolais,Richens,nrichens2g@accuweather.com,Male,1963/07/05,2024-07-14,20:11,2022-02-21T11:37:43\n" +
                "90,Hugues,Casado,hcasado2h@domainmarket.com,Male,2000/05/10,2024-02-17,12:37,2015-03-10T07:30:54\n" +
                "91,Charles,Fenlon,cfenlon2i@seattletimes.com,Male,,2024-04-12,16:06,2016-05-04T23:17:56\n" +
                "92,Parry,Measor,pmeasor2j@discuz.net,Male,1962/03/12,2024-10-03,10:18,2019-03-13T18:26:29\n" +
                "93,Josee,Audritt,jaudritt2k@nydailynews.com,Female,1976/03/06,2024-06-27,13:38,2020-07-10T15:19:57\n" +
                "94,Torry,Rooson,trooson2l@google.com.br,Male,1986/09/24,2024-08-19,16:31,2015-11-26T13:02:01\n" +
                "95,Merrielle,Kynson,mkynson2m@goo.ne.jp,Female,1973/09/06,2024-03-05,12:05,2016-06-21T15:45:54\n" +
                "96,Emilia,Spreadbury,espreadbury2n@webs.com,Female,,2024-10-29,12:22,2015-09-27T04:48:36\n" +
                "97,Bertie,Straw,bstraw2o@themeforest.net,Female,,2024-08-01,17:24,2014-05-24T08:32:54\n" +
                "98,Gianna,Bruck,gbruck2p@elpais.com,Female,,2024-06-03,20:32,2018-06-12T16:33:58\n" +
                "99,Robin,Biernacki,rbiernacki2q@jalbum.net,Male,,2024-07-25,9:35,2016-08-09T04:25:59\n" +
                "100,Aurie,Goodoune,agoodoune2r@bbb.org,Genderfluid,2000/11/19,2024-04-12,12:11,2010-07-13T02:29:19\n";

//        private int id;
//        private String first_name;
//        private String last_name;
//        private String email;
//        private String gender;
//        private LocalDate birthday;
//        private LocalDate reservation_date;
//        private LocalTime reservation_time;
//        private LocalDateTime created_at;

//        for (int i = 0; i < sarr.length; i++) {
//            System.out.println(sarr[i]);

//        sarr = str.split(",", -1);

        String[] sarr = str.split("\n");// size가 100인 String array
        MemberMk2[] memberMk2 = new MemberMk2[sarr.length];
//        for (int i = 0; i < sarr.length; i++) {
//            String[] sarr2 = sarr[i].split(",", -1);
//        }
        for (int i = 0; i < sarr.length; i++) {
            String[] sarr2 = sarr[i].split(",", -1);
//            System.out.println(sarr[i]);

            MemberMk2 member = new MemberMk2();
            member.setId(Integer.parseInt(sarr2[0]));
            member.setFirst_name(sarr2[1]);
            member.setLast_name(sarr2[2]);
            member.setEmail(sarr2[3]);
            member.setGender(sarr2[4]);

            LocalDate birthday = null;
            if (!sarr2[5].equals("")) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                birthday = LocalDate.parse(sarr2[5], formatter);
            }
            member.setBirthday(birthday);

            LocalDate reservation = null;
            if(!sarr2[6].equals("")) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                reservation = LocalDate.parse(sarr2[6]);
            }
            member.setReservation_date(reservation);


            LocalTime time = null;
            if (!sarr2[7].equals("")){
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
                time = LocalTime.parse(sarr2[7], formatter);
            }
            member.setReservation_time(time);

            LocalDateTime created_at = LocalDateTime.parse(sarr2[8]);
            member.setCreated_at(created_at);

            memberMk2[i] = member;

        }

        System.out.println(Arrays.toString(memberMk2));

    }
}

