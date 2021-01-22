import folium
def show_Molinuco():
    print ("You typed Molinuco.\n")
    mapa=folium.Map(location=[-2,-78],zoom_start=7,control_scale=True, tiles="openStreetMap")
    feature_group=folium.FeatureGroup(name="Molinuco")
    folium.Marker(location=[-.4218,-78.4059]).add_to(feature_group)
    mapa.add_child(feature_group)
    mapa.add_child(folium.map.LayerControl())
    mapa.save("C:\\Users\\Usuario\\Desktop\\Molinuco.html")

def show_cotopaxi():
    print ("You select cotopaxi\n")
    mapa=folium.Map(location=[-2,-78],zoom_start=7,control_scale=True, tiles="openStreetMap")
    feature_group=folium.FeatureGroup(name="Parque Nacional Cotopaxi")
    folium.Marker(location=[-.7007,-78.4297]).add_to(feature_group)
    mapa.add_child(feature_group)
    mapa.add_child(folium.map.LayerControl())
    mapa.save("C:\\Users\\Usuario\\Desktop\\cotopaxi.html")

def show_guayaquil():
    print ("You select guayaquil\n")
    mapa=folium.Map(location=[-2,-78],zoom_start=7,control_scale=True, tiles="openStreetMap")
    feature_group=folium.FeatureGroup(name="Centro Historico Guayaquil")
    folium.Marker(location=[-2.1449, -79.8705]).add_to(feature_group)
    mapa.add_child(feature_group)
    mapa.add_child(folium.map.LayerControl());
    mapa.save("C:\\Users\\Usuario\\Desktop\\guayaquil.html")
# map the inputs to the function blocks
options = {0 : show_Molinuco,
           1 : show_cotopaxi,
           2 : show_guayaquil
}
#value = int(input("Select your site number: \n Molinuco(0) \n cotopaxi(1) \n guayaquil(2) \n-> "))
#options[value]()
show_Molinuco()
show_cotopaxi()
show_guayaquil()
