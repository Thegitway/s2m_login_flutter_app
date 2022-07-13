import 'dart:io';

import 'package:dio/dio.dart';

class DioService{

  Dio dio=Dio(BaseOptions(
    //TODO update baseurl
    baseUrl: 'www.google.com',
    connectTimeout: 5000,
    receiveTimeout: 3000,
  ));


  Future getAccessToken(String email,String password) async{
    try {
      final response = await dio.post<dynamic>('mptf/generic/1/0/authentication/login',
          data: {
            'headerRequest': {
              'appPlateform': Platform.isIOS ? 'IOS' : 'ANDROID',
              'appVersion': 'appVersion',
              'appType': 'AGENT',
              'requesTime': DateTime.now().toIso8601String(),
              'preferredLanguage': 3,
              'institutionId': 'institutionId',
              'deviceInfo': {
                'osType': Platform.isIOS ? 'IOS' : 'ANDROID',
                'osVersion': Platform.version,
                'deviceType': Platform.isAndroid || Platform.isAndroid
                    ? 'PHONE'
                    : 'OTHER',
                'imei': 'string',
                'deviceLat': 'string',
                'deviceLon': 'string',
                'deviceId': 'string'
              }
            },
            'password': password,
            'login': email,
            'serialNumber': 'string'
          });
      if (response.statusCode == 200) {
        return response;
      } else
        return null;
    }
    catch (e) {
      //TODO handle error
      throw e;
    }

  }




}