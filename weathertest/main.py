import requests

api_address='http://api.openweathermap.org/data/2.5/weather?appid=2437fe178374f721a7021e1e5702c001&q='
city = input('City Name :')
url = api_address + city
json_data = requests.get(url).json()
format_add = json_data['weather'] [0] ['main'], json_data['weather'] [0] ['description'], json_data['main'] ['temp'] - 273.15
print(format_add)