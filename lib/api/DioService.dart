import 'dart:io';

import 'package:dio/dio.dart';

class DioService{

  Dio dio=Dio(BaseOptions(
    //TODO update baseurl
    baseUrl: 'https://194.204.196.220:9845/mobile-web-api',
    connectTimeout: 15000,
    receiveTimeout: 15000,
  ));

  Future getAccessToken(String username,String password) async{
    try {
      //TODO hachage du mot de passe

      final response = await dio.post<dynamic>('/mptf/generic/1/0/authentication/login',
          data: {
              'headerRequest':{
                'institutionId':'111222',
                'appVersion':'1.1',
                'preferredLanguage':2,
                'requesTime':1643133540288,
                'appType':'A',
                'appPlateform':'ANDROID'
              },
              'login':'+22222144747',
              'password':'truKY5SleqSNAVdACUP3ejF/83OAvDWvvOESSImUpegb/woA6SIL+yjV+WWYfBRb+jq2Z+SEF7TLIbDTzwzgWg==',
              'serialNumber':'25b70561-c5dc-4baa-8b0c-57e7678ce751'
            
          });
      if (response.statusCode == 200) {
        print("yahya ${response.data["accessToken"]}");
        print("response body ${response.data}");

        return response;
      } else
        return null;
    }
    catch (e) {
      //TODO handle error
      print('err'+e.toString());
          throw e;0

































































    }

  }




}