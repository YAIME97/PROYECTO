package estudianteApp;


/**
* estudianteApp/_estudianteStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from estudiante.idl
* mi�rcoles 8 de mayo de 2019 09:30:13 PM COT
*/

public class _estudianteStub extends org.omg.CORBA.portable.ObjectImpl implements estudianteApp.estudiante
{

  public boolean insertarEstudiante (int idestudiante, String nombreEstudiante, String apellidoEstudiante, int carrera)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("insertarEstudiante", true);
                $out.write_long (idestudiante);
                $out.write_wstring (nombreEstudiante);
                $out.write_wstring (apellidoEstudiante);
                $out.write_long (carrera);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return insertarEstudiante (idestudiante, nombreEstudiante, apellidoEstudiante, carrera        );
            } finally {
                _releaseReply ($in);
            }
  } // insertarEstudiante

  public String consultaEstudiante (int idestudiante)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("consultaEstudiante", true);
                $out.write_long (idestudiante);
                $in = _invoke ($out);
                String $result = $in.read_wstring ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return consultaEstudiante (idestudiante        );
            } finally {
                _releaseReply ($in);
            }
  } // consultaEstudiante

  public boolean actualizarEstudiante (int idestudiante, String nombreEstudiante, String apellidoEstudiante, int carrera)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("actualizarEstudiante", true);
                $out.write_long (idestudiante);
                $out.write_wstring (nombreEstudiante);
                $out.write_wstring (apellidoEstudiante);
                $out.write_long (carrera);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return actualizarEstudiante (idestudiante, nombreEstudiante, apellidoEstudiante, carrera        );
            } finally {
                _releaseReply ($in);
            }
  } // actualizarEstudiante

  public boolean eliminarEstudiante (int idestudiante)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("eliminarEstudiante", true);
                $out.write_long (idestudiante);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return eliminarEstudiante (idestudiante        );
            } finally {
                _releaseReply ($in);
            }
  } // eliminarEstudiante

  public String listarEstudiantes ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("listarEstudiantes", true);
                $in = _invoke ($out);
                String $result = $in.read_wstring ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return listarEstudiantes (        );
            } finally {
                _releaseReply ($in);
            }
  } // listarEstudiantes

  public void shutdown ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("shutdown", false);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                shutdown (        );
            } finally {
                _releaseReply ($in);
            }
  } // shutdown

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:estudianteApp/estudiante:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _estudianteStub
