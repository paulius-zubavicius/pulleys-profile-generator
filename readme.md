# Pulley's profile generator 


- Exporting as single polygon without any raptures to *.DXF (Drawing Exchange Format from CAD) R14 file profile.
- Supporting belt profiles: ** MXL DP40 XL H T25 T5 T10 AT5 HTD(3mm) HTD(5mm) HTD(8mm) GT2(2mm) GT2(3mm) GT2(5mm) **


This tool is for who is doing some 3d printing things and trying to make a custom pulley by belt profile. This tool are not for modeling or creating a final part it is just for exporting profile for further part development with your favorite CAD style tool.

This code was wrote base on [OpenSCAD script](https://www.thingiverse.com/thing:16627) (thanks for [droftarts](https://www.thingiverse.com/droftarts/about)). OpenSCAD also could export as DXF but exported polygons has some raptures and sometimes it makes complicated to connect raptures manually (it could be many of raptures).

### Usage

<pre><code>
required options: p, t

usage: pulley-profile-generator.jar
 -atd &lt;arg&gt;   Additional tooth depth (default value = 0.0 mm)
 -atw &lt;arg&gt;   Additional tooth width (default value = 0.2 mm)
 -p &lt;arg&gt;     Belt [p]rofile. One of: [MXL] [DP40] [XL] [H] [T25] [T5] [T10] [AT5] [HTD_3mm] [HTD_5mm] [HTD_8mm] [GT2_2mm] [GT2_3mm] [GT2_5mm]
 -t &lt;arg&gt;     [T]eeth count. Value should be 3 or more
</code></pre>


### Usage example
<pre><code>
$ java -jar pulley-profile-generator.jar -p HTD_5mm -t 40
</code></pre>
<p>It will export 40 teeth HTD (5mm) profile to file.</p>

