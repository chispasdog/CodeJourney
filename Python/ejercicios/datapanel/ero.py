import datapane as dp
import pandas as pd
 
ficheroCsv = r"C:\Users\pablo\Desktop\github\untitled\python\practicasinterfaces\datapanel\pt.csv"
df = pd.read_csv(ficheroCsv)
 
ventas2021 = df[df['Año'] == 2021]['Ventas'].sum()
ventas2020 = df[df['Año'] == 2020]['Ventas'].sum()
cambioVentas = ventas2021 - ventas2020

totalVentas = dp.BigNumber(
    heading='Ventas totales en 2021',
    value=ventas2021,
    change=cambioVentas,
    is_upward_change=cambioVentas > 0
)
 
tablaDatos = dp.DataTable(df, caption='Datos del Informe de Ventas')
 
logo = dp.Media(file=r"C:\Users\pablo\Desktop\github\untitled\python\practicasinterfaces\datapanel\ico.png")
titulo = dp.HTML('''
<p style="font-size:30px;text-align:center;color:#000000;background-color:#f2f2f2;">
    Informe de ventas
</p>''')
 
ficheroDescarga = dp.Attachment(file=ficheroCsv)
textoDescarga = dp.Text('**Puedes descargar el fichero con los datos del informe.**')
 
informeVentas = dp.Report(logo, titulo, totalVentas, tablaDatos, textoDescarga, ficheroDescarga)
 
informeVentas.save(path='Informe_Ventas.html', open=True)